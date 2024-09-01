import java.util.Scanner;

public class PalavraInvertida {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite sua frase: ");
        String frase = scanner.nextLine();

        String fraseInvertida = "";

        for(int i = frase.length() - 1; i >=0; i--){
            fraseInvertida +=  frase.charAt(i);
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);

        scanner.close();

    }
    
}
