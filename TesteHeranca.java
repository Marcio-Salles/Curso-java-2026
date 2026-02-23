
// Classe pai

class Animal {

	public void comer() {

		System.out.println("O animal come");
	}
}

// Classe filho

class Cachorro extends Animal {

	public void latir() {

	System.out.println("O cachorro late");
	}

}

// Classe que testa e cria o objeto

public class TesteHeranca {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro(); // Criar o objeto

		dog.latir();
		dog.comer();
		
	}
}