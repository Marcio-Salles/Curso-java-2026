public class TesteSalaDeAula {
    
    public static void main(String[] args) {
        
        // Criando três instâncias da classe SalaDeAula
        
        SalaDeAula aluno1 = new SalaDeAula();
        SalaDeAula aluno2 = new SalaDeAula();
        SalaDeAula aluno3 = new SalaDeAula();

        // Adicionando alunos à contagem
        
        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();

        // Exibindo o total de alunos
        
        SalaDeAula.exibirTotalAlunos();
    }
}
