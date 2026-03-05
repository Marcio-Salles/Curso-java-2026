interface Animal {
    void fazerSom(); // Método abstrato
}

// Classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("O cachorro faz au! au!");
    }
}

// Classe Gato que implementa a interface Animal
class Gato implements Animal {
    public void fazerSom() {
        System.out.println("O gato faz miau! miau!");
    }
}

 class TestInterfaceAula {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();  // "O cachorro faz au! au!"

        Gato gato = new Gato();
        gato.fazerSom(); // "O gato faz miau! miau!"
    }
}
