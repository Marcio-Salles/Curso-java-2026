// Classe abstrata Operacao
abstract class Operacao {
    public abstract double calcular(double a, double b);
}

// Classe Soma
class Soma extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

// Classe Subtracao
class Subtracao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}

// Classe Multiplicacao
class Multiplicacao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}

// Classe Divisao
class Divisao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return Double.NaN; // Retorna "Not a Number"
        }
        return a / b;
    }
}

// Classe principal Calculadora
public class CalculadoraPolimorfismo {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        double x = 10;
        double y = 5;

        System.out.println("Soma: " + soma.calcular(x, y));
        System.out.println("Subtração: " + subtracao.calcular(x, y));
        System.out.println("Multiplicação: " + multiplicacao.calcular(x, y));
        System.out.println("Divisão: " + divisao.calcular(x, y));

        // Teste de divisão por zero
        System.out.println("Divisão por zero: " + divisao.calcular(x, 0));
    }
}
