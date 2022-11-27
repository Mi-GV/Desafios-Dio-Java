import java.util.Scanner;

public class RPG {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador= leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo= leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        if (dados > 8  &&  dados < 10){
            dados = dados * 2;
        }

        int danoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));

        if (danoJogador <= 0){
            System.out.println("Jogador nao sobreviveu");
        }

        else {
            int danoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);

            if (danoInimigo <= 0){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }

        }


        //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
    }
}




