public class Funcionario {			// Classe

	String nome;					// Atributos
	String cargo;
	int idade;

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario(); // Objeto

		funcionario1.nome = "Marcio";
		funcionario1.cargo = "Dersenvolvedor";
		funcionario1.idade = 47;

		Funcionario funcionario2 = new Funcionario(); // Objeto

		funcionario2.nome = "Melissa";
		funcionario2.cargo = "Estudante";
		funcionario2.idade = 12;

		System.out.println(" Nome: " + funcionario1.nome);		
		System.out.println(" Cargo: " + funcionario1.cargo);		
		System.out.println(" Idade: " + funcionario1.idade);
		System.out.println("**********************");
		System.out.println(" Nome: " + funcionario2.nome);		
		System.out.println(" Cargo: " + funcionario2.cargo);		
		System.out.println(" Idade: " + funcionario2.idade);		
	}
}