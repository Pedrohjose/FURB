package Questao4;

public class Pessoa {
    public String nome;
    public double peso;
    public double altura;

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
