public class Aplicacao {
	
	public static void main(String[] args) {
	
	// Testando o construtor padrão
	Carros carro1 = new Carros();
	carro1.exibirDetalhes();
	
	// Testando o construtor com dois parâmetros
	Carros carro2 = new Carros("Toyota", "Corolla");
	carro2.exibirDetalhes();
	
	// Testando o construtor com três parâmetros
	Carros carro3 = new Carros("Honda", "Civic", 2020);
	carro3.exibirDetalhes();
	}
	}