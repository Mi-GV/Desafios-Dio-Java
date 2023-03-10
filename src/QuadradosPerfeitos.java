import java.util.*;

public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int resultado, contar, contarTotal;
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        contarTotal= 1000;
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                resultado = n;
                contar = 0;

                for (int q = i; q > 0; q--) {

                    while (resultado > 0) {
                        if (resultado >= d[q]) {
                            resultado = resultado - d[q];
                            contar++;
                        } else {
                            q--;
                        }
                    }
                }
                if (contarTotal > contar) {
                    contarTotal = contar;
                }
            }
        }
        System.out.println(contarTotal);
    }
}

//TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
//Desafio
//
//Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
//Entrada
//
//A entrada consiste em um número inteiro n, representando o valor total.
//Saída
//
//A saída consiste em retornar o menor número de números quadrados perfeitos.
