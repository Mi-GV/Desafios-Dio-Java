package Projetos;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        int posicao = 0;

        int[] vetor = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        boolean achou = false;
        for (int i = 0; i < vetor.length ; i++) {
            if (vetor[i] == valor) {
                achou = true;
                posicao = i;
            }
        }
        if (achou) {
            System.out.println("Achei " + valor + " na posicao " + posicao); // aqui, nessa parte não imprime o i, dá um erro!
        } else {
            System.out.println("Numero " + valor + " nao encontrado!");
        }

    }
}