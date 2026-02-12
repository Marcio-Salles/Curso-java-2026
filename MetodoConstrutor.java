public class MetodoConstrutor {

	// variáveis

	String nome; 
	String cargo;
	int idade;

	// Método construtor

	MetodoConstrutor ( String nome, String cargo, int idade) {

	this.nome = nome;
	this.cargo = cargo;
	this.idade = idade; 
}

	public static void main(String[] args) {

		MetodoConstrutor funcionario1 = new MetodoConstrutor("Marcio","Desenvolvedor",47);
		MetodoConstrutor funcionario2 = new MetodoConstrutor("Melissa","Estudante",12);

		System.out.println("Nome:" + funcionario1.nome);
		System.out.println("Cargo:" + funcionario1.cargo);
		System.out.println("Idade:" + funcionario1.idade);
		System.out.println("********************");
		System.out.println("Nome:" + funcionario2.nome);
		System.out.println("Cargo:" + funcionario2.cargo);
		System.out.println("Idade:" + funcionario2.idade);
		
	}
}