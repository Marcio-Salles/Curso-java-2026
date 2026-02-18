public class SalaDeAula {
    
    // Variável estática para armazenar o número total de alunos
    
    private static int totalAlunos = 0;

    // Método estático para adicionar alunos
    
    public static void adicionarAluno() {
        totalAlunos++;
    }

    // Método estático para exibir o número total de alunos
    
    public static void exibirTotalAlunos() {
        System.out.println("Total de alunos na sala: " + totalAlunos);
    }
}
