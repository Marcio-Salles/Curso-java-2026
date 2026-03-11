// Interface

interface Veiculo {
	void acelerar();
}


class Carro implements Veiculo { 
	public void acelerar() {
	System.out.println("O carro esta acelerando");
	}
}

class Moto implements Veiculo { 
	public void acelerar() {
	System.out.println("A moto esta acelerando");
	}
}

public class TestePolimorfismo {
		
		public static void main(String[] args) {	 	
		Veiculo meuCarro = new Carro(); // Objeto Polimórfico
		Veiculo minhaMoto = new Moto(); // Objeto Polimórfico
		meuCarro.acelerar();
		minhaMoto.acelerar();
	}
}