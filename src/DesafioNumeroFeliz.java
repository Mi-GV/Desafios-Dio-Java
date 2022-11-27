
import java.util.*;

public class DesafioNumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n >= 10) {

            String numeroEmString = String.valueOf(n);
            String[] split = numeroEmString.split("");

            int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

            int soma = 0;

            for (int i = 0; i < ints.length; i++) {

                soma = soma + ints[i] * ints[i];

            }

            n = soma;

        }

        if (n == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}







