/*
Desafio

Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.

Entrada:
A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

Saída:
Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor.

Exemplo de Entrada 	   Exemplo de Saída

7                      4 aparece 1 vez(es)
8                      8 aparece 2 vez(es)
10                     10 aparece 3 vez(es)
8                      260 aparece 1 vez(es)
260
4
10
10
 */

package Projetos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int valores = scr.nextInt();
        Map<Integer, Integer> numeros = new HashMap<>();

        for (int i = 0; i < valores; i++) {
            var numero = scr.nextInt();

            if(numeros.containsKey(numero)) { //2°
                int quantidade = numeros.get(numero);
                quantidade++;
                numeros.put(numero,quantidade);
            } else { //1°
                numeros.put(numero, 1);
            }

            /*if(!numeros.containsKey(numero)) {
                numeros.put(numero, 1);
            } else {
                int quantidade = numeros.get(numero);
                quantidade++;
                numeros.put(numero,quantidade);
            }
            */
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey()+ " aparece " +  e.getValue() + " vez(es)"));
    }
}