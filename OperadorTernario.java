public class OperadorTernario {

	public static void main(String[] args) {
		
		int numero = 10;
		String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
		
		System.out.println("O número é " + resultado );

		/* Operador Ternário:

	    Faz a mesma verificação, mas de forma mais compacta: 
	    (numero % 2 == 0) ? "Par" : "Ímpar".Use-o para simplificar seu código em situações onde 
		uma simples condição if-else é suficiente.*/
	}
}