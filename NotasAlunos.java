

public class NotasAlunos {

    public static void main(String[] args) {
        
        double[] notas = new double[5]; // Criação do Array
        notas[0] = 5.3;
        notas[1] = 8.6;
        notas[2] = 2.3;
        notas[3] = 6.5;
        notas[4] = 2.8;

        notas = new double[]{5.3, 8.6, 2.3, 6.5, 2.8};

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);
       System.out.println(".................");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }   
}
