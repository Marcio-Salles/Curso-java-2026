import java.util.*;

public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> numerosInteiros = new HashSet<>();

        // Adicionando números inteiros
        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(5);
        numerosInteiros.add(6);

        // Verificar se contém
        boolean contemAmbos = numerosInteiros.contains(1) && numerosInteiros.contains(2);
        System.out.println("Contém os números 1 e 2? " + contemAmbos);

        // Adicionando mais elementos
        numerosInteiros.add(7);
        numerosInteiros.add(8);

        System.out.println("Conjunto completo: " + numerosInteiros);

        // Removendo um elemento
        numerosInteiros.remove(4);

        System.out.println("Conjunto após remoção: " + numerosInteiros);
    }
}
