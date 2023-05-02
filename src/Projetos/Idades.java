/*
Desafio:

Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.

Exemplo de Entrada:	       Exemplo de Saída:

34                          39.25
56
44
23
-2

 */

package Projetos;

import java.io.IOException;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n = leitor.nextInt();

        while (n >= 1){
            if (n >= 0) {
                soma+= n; // soma = soma + n;
                cont++;
            }
            n = leitor.nextInt();
        }
        double media = soma/(float)cont;
        System.out.println(String.format("%.2f",media));
    }
}