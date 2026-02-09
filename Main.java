public class Main {
	public static void main(String[] args) {

		// Variáveis

		int farinha = 2;
		System.out.println("A receita requer " + farinha + " xícaras de farinha ");


       // Tipos primitivos em Java:

		byte idade = 25;
		short Ano = 2026;
		int populacaoCidade = 500000;
		long populacaoMundial = 7000000000L;
		float altura = 1.75f;
		double salario = 3300.25;
		boolean estudante = true;
		char inicialNome = 'M';


		System.out.println("Idade: " + idade);
		System.out.println("Ano: " + Ano);
		System.out.println("População da cidade: " + populacaoCidade);
		System.out.println("População mundial: " + populacaoMundial);
		System.out.println("Altura: " + altura);
		System.out.println("Salário: " + salario);
		System.out.println("Estudante: " + estudante);
		System.out.println("Inicial do nome: " + inicialNome);


		// Promoções Automáticas em Java

	    // byte, short e char são promovidos para int quando usados em uma expressão.


	    byte a = 10;
	    int b = a + 5;
	    System.out.println("O valor de a é: " + a);


	    // Uso de var em Java

	    var numero = 10; // Inferência para int
	   // var usuario = new Usuario();

	    System.out.println("O valor do numero é= " + numero);

	    /* Ola meu nome é Marcio
	       gosto de metal extremo */

	}
}
