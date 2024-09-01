public class ValorSoma {
    public static void main(String[] args) throws Exception {
       
        int indice = 13;
        int soma = 0;
        int K = 0;

        while (K < indice) {
            K = K + 1;
            soma = soma + K;   
        }

        System.out.println("O valor de soma é: " + soma);
    }
}
