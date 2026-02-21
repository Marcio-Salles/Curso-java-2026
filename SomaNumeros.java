public class SomaNumeros {

public static void main(String[] args) {

		int[] numeros = new int[1000];// Criação da Array
		int soma = 0; // Inicialização da Array

		for (int i = 1; i <= 1000; i++) { // Loop
		numeros[i - 1] = i;
		soma += i;
		}

		System.out.println("Soma dos números de 1 até 1000: " + soma);
	}
}

/* 1. Um array chamado numeros é criado para armazenar os números de 1 a 1000.
   2. A variável soma é inicializada com zero.
   3. Um loop percorre os números de 1 a 1000, preenchendo o array e acumulando a soma.
   4. O resultado da soma é impresso no final.*/