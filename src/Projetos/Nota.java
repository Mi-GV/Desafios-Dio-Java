package Projetos;

import java.util.Scanner;

public class Nota {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Java.Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Java.Nota Inválida! Digite Novamente: ");
            nota = scan.nextInt();
        }
    }
}
