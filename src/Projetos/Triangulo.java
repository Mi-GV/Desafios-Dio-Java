/*
Desafio

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:

Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:

Area = XX.X
Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

Entrada: A entrada contém três valores reais.

Saída: O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada 	    Exemplo de Saída

6.0 4.0 2.0             Area = 10.0
---------------------------------------------
6.0 4.0 2.1             Perimetro = 12.1
 */

package Projetos;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double soma;
        double maior;
        boolean triangulo;

        if((A<B+C) && (B<A+C) && (C<A+B)) {
            double perimetro = A + B + C;

            System.out.println("Perimetro = "+ perimetro);
        } else {
            double area = ((A + B) * C) / 2;

            System.out.println("Area = " + area);
        }
    }
}

