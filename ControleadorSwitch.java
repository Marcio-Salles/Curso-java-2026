public class ControleadorSwitch {

	public static void main(String[] args) {
		
		int day = 3;

		switch (day) {

		case 1 -> System.out.println("Segunda feira");
		case 2 -> System.out.println("Terça feira");
		case 3 -> System.out.println("Quarta feira");

		default -> System.out.println("Desconhecido");


			/* Switch exemplo 2

					String dia = "Ter.";
					String tipoDeDia = switch (dia) {
					
					case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
					case "Sabado", "Domingo" -> "Fim de semana";
					default -> "Desconhecido";
					
					};
					
					System.out.println(tipoDeDia); // Dia util */

		}
	}
}