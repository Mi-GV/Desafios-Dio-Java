package Projetos;

import java.util.Scanner;

public class Nome{

    //Lendo e imprimindo textos e números
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1) pedir pro usuário informar:
        //1) Java.Nome
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite seu sobrenome:   ");
        String sobrenome = in.nextLine();
        //2) Idade
        System.out.println("Informe a sua idade:  ");
        int idade = in.nextInt();
        //3) Cidade
        System.out.println("Informe a sua cidade de nascimento: ");
        String cidade = in.next();

        System.out.println("Olá" + " "  +nome+ " " +sobrenome);
        System.out.println("Sua idade é" + " " +idade  + " " + "e você é natural de" + " " +cidade);

        System.out.println("Informe seu sexo M/F: ");
        String sexo = in.next();

        System.out.println("Qual seu estado civil?: ");
        String civil = in.next();

    }
}