package main;

import entidades.*;
import enums.TipoObra;
import excecoes.EntidadeExistenteException;
import excecoes.EntidadeNaoEncontradaException;

import java.util.*;

public class Sistema {

	private final Map<Integer, Profissional> profissionais = new HashMap<>();

	private final Map<String, Obra> obras = new TreeMap<>();

	public void cadastrarProfissional(Profissional p) {
		if (profissionais.values().stream().anyMatch(x -> x.getCpf().equals(p.getCpf()))) {
			throw new EntidadeExistenteException("CPF já cadastrado: " + p.getCpf());
		}

		if (profissionais.containsKey(p.getId())) {
			throw new EntidadeExistenteException("ID já cadastrado: " + p.getId());
		}

		profissionais.put(p.getId(), p);
	}

	public Profissional buscarProfissional(int id) {
		Profissional p = profissionais.get(id);
		if (p == null)
			throw new EntidadeNaoEncontradaException("Profissional não encontrado: " + id);
		return p;
	}

	public List<Profissional> listarProfissionais() {
		return new ArrayList<>(profissionais.values());
	}

	public void cadastrarObra(Obra o) {
		if (obras.containsKey(o.getNumero())) {
			throw new EntidadeExistenteException("Número de obra já cadastrado: " + o.getNumero());
		}
		obras.put(o.getNumero(), o);
	}

	public Obra buscarObra(String numero) {
		Obra o = obras.get(numero);
		if (o == null)
			throw new EntidadeNaoEncontradaException("Obra não encontrada: " + numero);
		return o;
	}

	public List<Obra> listarObras() {
		return new ArrayList<>(obras.values());
	}

	public List<Obra> filtrarPorTipo(TipoObra tipo) {
		List<Obra> res = new ArrayList<>();
		for (Obra o : obras.values()) {
			if (o.getTipo() == tipo) {
				res.add(o);
			}
		}
		return res;
	}

	public List<Obra> filtrarPorProfissional(int idProfissional) {
		List<Obra> res = new ArrayList<>();
		for (Obra o : obras.values()) {
			for (Profissional p : o.getResponsaveis()) {
				if (p.getId() == idProfissional) {
					res.add(o);
					break;
				}
			}
		}
		return res;
	}
}
