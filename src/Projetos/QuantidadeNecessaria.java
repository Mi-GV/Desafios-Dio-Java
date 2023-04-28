package Projetos;

import java.util.Scanner;

public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int N = scanner.nextInt();
            int X = scanner.nextInt();

            int quantidade = N * X;
            int pizzas = quantidade / 4;

            if (quantidade % 4 > 0) {
                pizzas++;
            }

            System.out.println(pizzas);
        }

    }
}