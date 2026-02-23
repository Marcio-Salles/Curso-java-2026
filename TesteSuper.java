class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    String raca;

    Cachorro ( String nome, String raca) {

        super(nome);
        this.raca = raca;
    }
}

public class TesteSuper {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Tormentor", "Pastor alemão");
        dog.nome = "Tormentor";
        System.out.println("O nome do animal é " + dog.nome);
        System.out.println("A raça do cachorro é " + dog.raca);
        
    }
}