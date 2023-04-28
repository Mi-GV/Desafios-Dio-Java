package Projetos;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int conte = 0;
        int soma = 0;

        do {

            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            conte = conte + 1;

        } while(conte < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
