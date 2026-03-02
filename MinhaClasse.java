
 class SuperClasse {
    
    public void imprime() {
        System.out.println("imprime");
    }
}

public class MinhaClasse extends SuperClasse {

    @Override
    public void imprime() {
        System.out.println("imprime diferente");
    }

    public static void main(String[] args) {
        MinhaClasse minhaInstancia = new MinhaClasse();
        minhaInstancia.imprime();
    }
}


