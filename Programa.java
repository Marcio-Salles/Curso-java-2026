

interface Veiculo {
    void iniciar();
    void parar();

    default void buzinar() {
        System.out.println("Buzinando");
    }
}



class Carro implements Veiculo {
	public void iniciar() {
		System.out.println("Ligando o motor do carro !!!");
	}

	public void parar() {
		System.out.println("Parando o motor do carro !!!");
	}
}

class Caminhao implements Veiculo {
	public void iniciar() {
		System.out.println("Ligando o motor do caminhão !!!");
	}

	public void parar() {
		System.out.println("Parando o motor do caminhão !!!");
	}
}

class Programa {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.iniciar();
		carro.buzinar();	

		Caminhao caminhao = new Caminhao();
		caminhao.iniciar();
		caminhao.buzinar();
	}
}