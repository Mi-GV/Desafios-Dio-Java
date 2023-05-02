/*

Desafio:

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada:
Você receberá 5 valores inteiros.

Saída:
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada 	   Saída

-5             3 par(es)
0              2 impar(es)
-3             1 positivo(s)
-4             3 negativo(s)
12

1              1 par(es)
2              2 impar(es)
3              3 positivo(s)
               0 negativo(s)
 */

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