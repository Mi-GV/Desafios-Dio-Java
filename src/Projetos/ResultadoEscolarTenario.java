package Projetos;

public class ResultadoEscolarTenario {

    public static void main(String[] args) {
      int nota = 9;
     // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
      System.out.println(resultado);

    }
}