
public class Bolo {		// classe

    int QuantidadeAcucar;	// Variável de intância fora do método

    public static void main(String[] args) {
        
        Bolo boloDeChocolata = new Bolo(); 		 // 1° Objeto
        boloDeChocolata.QuantidadeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();		// 2° Objeto
        boloDeBaunilha.QuantidadeAcucar = 150;

        System.out.println("Quantidade de açucar é: " + boloDeChocolata.QuantidadeAcucar);
        System.out.println("Quantidade de açucar é: " + boloDeBaunilha.QuantidadeAcucar);
    }
}
