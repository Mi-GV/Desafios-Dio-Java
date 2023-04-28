package Projetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnaliseDeNUmeros  {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int  par = 0;
        int  impar = 0;
        int  positivo = 0;
        int  negativo = 0;
        int  numero = 0;
        int linha;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = Integer.parseInt(br.readLine());
            numero = Integer.parseInt(String.valueOf(linha));

            if (numero % 2 == 0){
                par++;
            }else{
                impar++;
            }
            if(numero > 0) positivo++;
            if(numero < 0) negativo++;
        }

        System.out.println("" +par + " par(es)");
        System.out.println("" +negativo + " impar(es)");
        System.out.println("" +positivo + " positivo(s)");
        System.out.println("" +negativo + " negativo(s)");
    }

}