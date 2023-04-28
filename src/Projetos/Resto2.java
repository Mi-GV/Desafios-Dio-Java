package Projetos;

import java.io.IOException;
import java.util.Scanner;

public class Resto2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        for (int i = 0; i < 10000; i++)
            if (i % N == 2) System.out.println(i);

        leitor.close();
    }
}

