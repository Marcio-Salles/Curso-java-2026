import java.util.Set;
import java.util.HashSet;

public class ExemploSet {

    public static void main(String[] args) {
        
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos
        conjunto.add("Java");
        conjunto.add("C++");
        conjunto.add("Python");

        // Verificando se o conjunto tem um elemento
        System.out.println("Contém 'Java': " + conjunto.contains("Java")); // True

        // Adicionando mais elementos
        conjunto.add("Javascript");
        conjunto.add("Ruby");

        System.out.println("Conjunto completo: " + conjunto);

        // Removendo um elemento
        conjunto.remove("Python");

        System.out.println("Conjunto após remoção: " + conjunto);
    }
}
