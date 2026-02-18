import empresa.dados.*;

class FolhaDePagamento {
    
    public static void main(String[] args) {
    
    Funcionarios funcionarios = new Funcionarios("Marcio", 3300.00);

    System.out.println(funcionarios.obterInfo());

    funcionarios.alterarQualquerSalario ( funcionarios, 3900.00 );

    System.out.println(funcionarios.obterInfo());

        //funcionarios.aumentarSalario(3000.00);

        //System.out.println(funcionarios.obterInfo());
    }
}



