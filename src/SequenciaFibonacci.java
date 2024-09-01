import java.util.Scanner;

public class SequenciaFibonacci {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite um número para verificar se pertence a sequência de Fibonacci: ");
            int numero = scanner.nextInt();    

        scanner.close();

        if (Fibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }
    }

    public static boolean Fibonacci (int numero){
        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;

            b = a + b;
            a = temp;
        }

        return numero == b || numero == 0;
    }
}
