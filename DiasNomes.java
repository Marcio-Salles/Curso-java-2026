public class DiasNomes {
	public static void main(String[] args) {
		
		String Mes = "Agosto";

		String numeroDias = switch ( Mes ) {

		case "Janeiro", "Março","Maio", "Julho", "Agosto", 
	"Outubro", "Dezembro" -> "O número de dias é 31";
		
		case "Abril", "Junho", "Setembro", "Novembro"
		-> "O numero de dias é 30"; 

		case "Fevereiro" -> "O número de dias é 28 ou 29"; 

		default -> "Mês inexistente";

		};

		System.out.println(numeroDias);

		/* Erros cometidos neste exercício

     	Strings não declaradas corretamente

     	Aqui Agosto não está entre aspas, 
     	então o compilador entende como uma
     	variável não declarada. 

     	Falta o operador de atribuição =

     	string não fechada "Agosto"

     	Uso de "ou" ao invés de vírgulas

     	O System.out.println(numeroDias); 
     	deve vir após o fechamento da string */


	}
}