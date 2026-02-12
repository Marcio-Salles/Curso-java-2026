package empresa.dados; // Pacote

public class Funcionarios {  // Váriaveis

	String nome;
	double salario;

	public Funcionarios (String nomeInit, double salarioInit){ // Método Construtor

		nome = nomeInit; 
		salario = salarioInit;          // Inicialização Método contrutor

		System.out.println("Nome: " + nome);
		System.out.println("O sálario ´: " + salario);
	}
}

