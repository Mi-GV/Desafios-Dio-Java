import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();

        boolean numero = (A == B);
        
        if (A == B){
            System.out.println("Sao iguais");
        }

        else {
            System.out.println("Nao sao iguais");
        }


 }
}