public class PromocaoAutomatica {

	public static void main(String[] args) {
		
		byte a = 10;            // 8 bits    -128 a 127
		short b = 20;        // 16 bits   -32768 a 32767
		char c = 'C';            // 16 bits   caracteres únicos
		int d = 30;             // 32 bits   -2147483648 a 2147483647
		long e = 40L; // 64 bits --> -9223372036854775808 a 9223372036854775807
		float f = 1.5F; // ponto flutuante de aproximadamente ±4.9E-324 a ±1.7976931348623157E308
		double g = 2.5; //ponto flutuante de aproximadamente ±4.9E-324 a ±1.7976931348623157E308


		int resultado = a + b;
		double resultado2 = g - f;
		var resultado3 = d + e;
		

		System.out.println("A soma de a mais b é: " + resultado );
		System.out.println("O Character escolhido foi o " + c );
		System.out.println("A soma do int d mais o longe e é " + resultado3 );
		System.out.println("O double g menos o float f é o double " + resultado2 );

	}
}

