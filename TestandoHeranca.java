class Animal {
	
	public void fazerSom(){

	System.out.println("O animal faz o som");
	}
}

class Cachorro extends Animal {
	
	public void fazerSom() {   // Sobrescrita de método

	System.out.println("O cachorro late");
	}
}

public class TestandoHeranca {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		dog.fazerSom();
		
	}
}