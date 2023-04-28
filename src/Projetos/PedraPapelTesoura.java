package Projetos;

import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == jogadaInimigo) {
            System.out.print("Empatou");
        } else if ((jogadaJogador == 1 && jogadaInimigo == 3) ||
                (jogadaJogador == 3 && jogadaInimigo == 2)
                || (jogadaJogador == 2 && jogadaInimigo == 1)) {
            System.out.print("Ganhou");
        } else {
            System.out.print("Perdeu");
        }
    }
}