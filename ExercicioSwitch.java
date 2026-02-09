public class ExercicioSwitch {

	public static void main(String[] args) {
		
		int nivel = 2;

		String feedback = switch (nivel) {

		case 1 -> " Muito insatisfeito";
		case 2 -> "Insatisfeito";
		case 3 -> " Neutro";
		case 4-> " Satisfaito";
		case 5 -> "Satisfeito";
		default -> "Error";

		};

		System.out.println(feedback);

	}
}