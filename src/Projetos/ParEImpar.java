package Projetos;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidades de números: ");
        quantNumeros = scan.nextInt();

     int conte = 0;
     do {
         System.out.println("Números: ");
         numero = scan.nextInt();

         if (numero % 2 == 0) quantPares++;
         else quantImpares++;

         conte ++;

     } while (conte < quantNumeros);

     System.out.println("Quantidade Par: " + quantPares);
     System.out.println("Quantidade Impar: " + quantImpares);
    }
}
