package Projetos;

import java.util.Scanner;

public class OperacoesMatematicas2 {
    
    public static void  main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero1 = ler.nextInt();
        int numero2 = ler.nextInt();
        
        int soma = (numero1 + numero2);

        System.out.println("O Resultado da soma é " + soma);

         numero1 = ler.nextInt();
         numero2 = ler.nextInt();
        
        int Subtração = (numero1 - numero2);

        System.out.println("O Resultado da Subtração é " + Subtração);

    }
}
