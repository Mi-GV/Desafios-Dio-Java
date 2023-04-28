package Projetos;

import java.util.Scanner;
import java.util.Arrays;

public class DiferencaEntreDigitos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        int produto = 1;
        int soma = 0;

        for (int i =0; i < ints.length; i++){
            produto = produto * ints[i];
            soma = soma + ints[i];
        }

        int resultado = produto - soma;

        System.out.println(resultado);


        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.

    }
}