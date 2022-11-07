import java.util.Scanner;

public class MediadeIdade {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int idade1 = leitor.nextInt();
            int idade2 = leitor.nextInt();
            int idade3 = leitor.nextInt();

            System.out.println(idade1 + ", " + idade2 + ", " + idade3);
            int media = (idade1 + idade2 + idade3)/3;
            System.out.println(media);

            if (media >= 0 && media <= 25){
             System.out.println("Jovem"); 
            }

            if (media >= 26 && media <= 60){
                System.out.println("Adulta");
            }

            if (media >= 61){
                System.out.println("Idosa");
            }
        }    
        
    }
}