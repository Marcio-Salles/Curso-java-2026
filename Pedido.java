import java.util.ArrayList;
import java.util.List;

interface PedidoRestaurante {
    void adicionarItem(String item, double preco);
    double calcularTotal();
    void mostrarResumo();
}

 class Pedido implements PedidoRestaurante {

    private double total = 0;
    private List<String> itens = new ArrayList<>();

    @Override
    public void adicionarItem(String item, double preco) {
        System.out.println("Adicionando " + item + " (R$" + preco + ") ao pedido.");
        total += preco;
        itens.add(item + " - R$" + preco);
    }

    @Override
    public double calcularTotal() {
        return total;
    }

    @Override
    public void mostrarResumo() {
        System.out.println("\nResumo do Pedido:");
        for (String item : itens) {
            System.out.println(item);
        }
        System.out.println("Total: R$" + total);
    }

    public static void main(String[] args) {
        PedidoRestaurante pedido = new Pedido();
        pedido.adicionarItem("Hambúrguer", 15.0);
        pedido.adicionarItem("Batata Frita", 8.0);
        pedido.adicionarItem("Refrigerante", 4.0);

        pedido.mostrarResumo();
    }
}
