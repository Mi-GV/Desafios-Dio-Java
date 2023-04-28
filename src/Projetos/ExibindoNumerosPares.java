package Projetos;/*
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
Entrada

Você receberá 1 valor inteiro N, onde N > 0.
Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

Exemplo de Entrada 	Exemplo de Saída
6 	                2,4,6

 */

import java.io.IOException;
import java.util.Scanner;


public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for(int i = 2; i <= Integer.parseInt(String.valueOf(numero)); i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

     }
}
