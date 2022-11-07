import java.util.Scanner;

public class APP {
    public static void main(String[]args) {
        System.out.println("oi");

        System.out.println("Qual seu nome?");

        // Scanner serve como processador de entrada, ler um input
        
        Scanner ler = new Scanner(System.in);

        String nome = ler.next();

        System.out.println("Seu nome é " + nome);

        
        
    }
}