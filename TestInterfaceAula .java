interface Animal {
	void fazerSom(); // Metodo abstrato
}

// Classe Cachorro que implementaba interface Animal

class Cachorro imprements Animal {
	public void fazerSom() {
		Systen.out.println("O cachorro faz au! au!")
	}
}

// Classe Gato que implementaba interface Animal

class Gato imprements Animal {
	public void fazerSom() {
		Systen.out.println("O gato faz miau! miau!")
	}
}

publi class TestInterfaceAula {
	public static void main (String[] args) {

	Cachorro cachorro = new Cachorro();
	cachorro.fazerSom();  // "O cachorro faz au! au!"

	Gato gato = new Gato();
	gato.fazerSom(); // "O gato faz miau! miau!"
	}
}