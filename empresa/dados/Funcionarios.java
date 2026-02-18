package empresa.dados;

public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }

    public String obterInfo() {
        return "Nome: " + nome + ", Salário: " + salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

        // Método para alterar o salário

        public void alterarQualquerSalario(Funcionarios func, double novoSalario){
        func.salario = novoSalario;
    }
}
