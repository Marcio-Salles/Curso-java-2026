

        
    public class TestStatic {
    
    // Método estático sobrecarregado #1
    
    public static void exibirValor(int a) {
    System.out.println("O valor do inteiro é: " + a);
    }
    
    // Método estático sobrecarregado #2
   
     public static void main(String[] args) {
         exibirValor(10);
     }
 }   

       /* Neste exemplo, exibirValor é um método estático.
        Ele pode ser chamado diretamente sem a necessidade 
        de criar uma instância da classe TestStatic.*/


