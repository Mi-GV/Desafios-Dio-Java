import java.io.IOException;
        import java.util.Scanner;

public class AcimaDaDiagonalPrincipal{

    public static void main (String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; ++i) {
            for (int j = 0; j < M[i].length; ++j) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < M.length - 1; ++i) {
            for (int j = i + 1; j < M[i].length; ++j) {
                soma += M[i][j];
            }
        }

        if (O == 'M') {
            soma /= ((M.length * M.length) - 12) / 2;
        }

        System.out.printf("%.1f%n", soma);
    }
}