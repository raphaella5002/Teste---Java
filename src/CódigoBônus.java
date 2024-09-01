public class CódigoBônus {
    public static void main(String[] args) {
        
        String frase = "Espero que tenham gostado";

        String[] palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            for (int j = 0; j < palavras.length - 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.print(palavras[i]); 
            System.out.println(); 
        }
    }
}