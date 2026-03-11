// Classe abstrata Veiculo
abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    // Método que pode ser sobrescrito pelas subclasses
    public void exibirInformacoes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}

// Classe derivada Onibus
class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Ônibus - Placa: " + getPlaca() + ", Ano: " + getAno() + ", Assentos: " + assentos);
    }
}

// Classe derivada Caminhao
class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Caminhão - Placa: " + getPlaca() + ", Ano: " + getAno() + ", Eixos: " + eixos);
    }
}

// Classe principal GerenciadorVeiculos
public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("ABC-1234", 2015, 50);
        Caminhao caminhao = new Caminhao("XYZ-9876", 2018, 4);

        onibus.exibirInformacoes();
        caminhao.exibirInformacoes();
    }
}
