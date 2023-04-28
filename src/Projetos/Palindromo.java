package Projetos;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contrario = "";

        System.out.println("Digite uma palavra para verificar se é um palíndromo");

        String palavra = sc.nextLine();

        for (int i = (palavra.length() -1); i >= 0; i--) {
            contrario = contrario + palavra.charAt(i);
        }


        if (contrario.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.println("\n\n\t\t TRUE ");
        } else {
            System.out.println("\n\n\t\tFalse ");
        }

    }

}
//Desafio
//
//Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida.
//
//Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
//
//Logo, NÃO é um Palíndromo.
//
//Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.
//Entrada
//
//A entrada consiste em um palavra.
//Saída
//
//Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.


