public class Produto {

	private	String nome;
	private String sabor;
	private int volume;

	public Produto (String nome,String sabor, int volume){

		this.nome = nome;
		this.sabor = sabor;
		this.volume = volume;
	}

	public static void main(String[] args) {
		
		Produto produto = new Produto("Kapo","Uva", 1000);


		System.out.println("Produto " + produto.nome);
		System.out.println("Sabor " + produto.sabor);
		System.out.println("Volume " + produto.volume);
	}

}