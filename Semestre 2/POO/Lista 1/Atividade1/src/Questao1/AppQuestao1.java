package Questao1;


public class AppQuestao1 {

	public static void main(String[] args) {

		Pessoa pedro;
		pedro = new Pessoa();
		
		pedro.altura = 1.75;
		pedro.peso = 78;
		
		System.out.println(pedro.calcularIMC());
	}

}
