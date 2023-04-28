package Projetos;

public class BuscaSequencial1 {

    public static void main(String[] args) {


        int[] contas = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int i;

        for (i = 0; i < contas.length; i++) {
           if(contas[i] < 0) {
              System.out.println("Negativo "  + contas[i]);
           }
        }

        for (i = 0; i < contas.length; i++){
            if(contas[i] > 0) {
                System.out.println("Positivo "  + contas [i]);
            }
        }

    }
}