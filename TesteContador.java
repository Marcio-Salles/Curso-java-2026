class Contador {
				
		static int contagem = 0;
		public Contador() {
		contagem++;
	}
}

public class TesteContador {
	
	public static void main(String[] args) {
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();

		System.out.println("O número de objetos criados são: " + Contador.contagem);
	}
}