public class Carro{

	String marcaDoCarro;
	String modeloDoCarro;
	int anoDoCarro;

	public Carro (){
		marcaDoCarro = "Desconhecida";
		modeloDoCarro = "Desconhecido";
		anoDoCarro = 0;
	}

	public Carro (String marca, String modelo){

		marcaDoCarro = marca;
		modeloDoCarro = modelo;
		anoDoCarro = 0;
	}

	public Carro (String marca, String modelo, int ano) {

		marcaDoCarro = marca;
		modeloDoCarro = modelo;
		anoDoCarro = ano;	
	}

	public void exibirDetalhes() {
		
		System.out.println("Marca: " + marcaDoCarro);
		System.out.println("Modelo: " + modeloDoCarro);
		System.out.println("Ano: " + anoDoCarro);
		System.out.println();
		
		}

		public static void main(String[] args) {
	        Carro carro1 = new Carro();
	        carro1.exibirDetalhes();

	        Carro carro2 = new Carro("Toyota", "Corolla");
	        carro2.exibirDetalhes();

	        Carro carro3 = new Carro("Honda", "Civic", 2020);
	        carro3.exibirDetalhes();
	   		 }
		
	}




  