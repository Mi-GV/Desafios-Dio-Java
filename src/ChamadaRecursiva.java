import java.util.*;

public class ChamadaRecursiva {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int N = numero.nextInt();

        int soma = somatorio(N);

        System.out.println(soma);
    }
    
            static int somatorio(int numero) {
                if (numero == 0) {
                    return 0;
                } else {
                    return numero + somatorio(numero - 1);
                }
            }
        
}
