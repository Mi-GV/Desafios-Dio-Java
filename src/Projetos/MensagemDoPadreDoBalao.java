package Projetos;

import java.io.IOException;
import java.util.Scanner;

public class MensagemDoPadreDoBalao{
        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            while (leitor.hasNext()) {
                String alphabet = leitor.next();
                String word = "";
                int letters = leitor.nextInt();
                for (int i = 0; i < letters; i++) {
                    int letter = leitor.nextInt() -1;
                    word += alphabet.charAt(letter);
                }
                System.out.println(word);
            }
        }

}

