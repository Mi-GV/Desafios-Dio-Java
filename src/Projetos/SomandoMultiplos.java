package Projetos;

import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int soma = 0;
        for (int i = A; i <= N; i= i+ A){
           soma = soma + i; 
       }
        System.out.println("A soma dos multiplos sao:" + soma);

    }

}