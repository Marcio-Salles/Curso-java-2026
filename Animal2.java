class AnimalDois {
    void som() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends AnimalDois {
    @Override
    void som() {
        System.out.println("Latido");
    }
}
