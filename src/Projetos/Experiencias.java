package Projetos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coelhos =0,ratos =0,sapos =0;
        int quantidadeDeInputs = input.nextInt();
        Double totalDeCobaias = 0.0;

        input.nextLine();

        for (int i = 0; i < quantidadeDeInputs; i++) {
            String teste[] = input.nextLine().split(" ");
            char cobaia = teste[1].charAt(0);
            int quantidade = Integer.parseInt(teste[0]);
            totalDeCobaias += quantidade;

            switch (cobaia){
                case'C':
                    coelhos += quantidade;
                    break;
                case 'R':
                    ratos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }

        }

        Double porcentagemDeCoelhos = coelhos / totalDeCobaias;
        Double porcentagemDeRatos = ratos / totalDeCobaias;
        Double porcentagemDeSapos = sapos / totalDeCobaias;

        DecimalFormat format = new DecimalFormat("0.00 %");

        System.out.printf("Total: %.0f cobaias\n", totalDeCobaias);
        System.out.printf("Total de coelhos:  %d\n", coelhos);
        System.out.printf("Total de ratos:  %d\n", ratos);
        System.out.printf("Total de sapos:  %d\n", sapos);

        System.out.printf("Porcentagem de coelhos: %s\n", format.format(porcentagemDeCoelhos));
        System.out.printf("Porcentagem de ratos: %s\n", format.format(porcentagemDeRatos));
        System.out.printf("Porcentagem de sapos: %s\n", format.format(porcentagemDeSapos));

        input.close();
    }
}