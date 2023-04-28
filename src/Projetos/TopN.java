package Projetos;

import java.util.Scanner;

public class TopN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int k = scan.nextInt();

        for (int i = 0; i < TOPS.length; i++) {
            int posicao = TOPS[i];

            if (k <= posicao){
                System.out.println("Top "  + posicao);
                break;
            }
        }
    }
}


