package InformacoesEscola;

import InformacoesEscola.Cor;

public class Escola {
    public static void main(String[]args) throws Exception {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "John";
        estudante1.idade = 12;
        estudante1.cor = Cor.BRANCO;
        estudante1.sexo = Sexo.MASCULINO;

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sophia";
        estudante2.idade = 10;
        estudante2.cor = Cor.AMARELO;
        estudante2.sexo = Sexo.FEMININO;

        Estudante estudante3 = new Estudante();
        estudante3.nome = "Lily";
        estudante3.idade = 11;
        estudante3.sexo = Sexo.FEMININO;

    }
}
