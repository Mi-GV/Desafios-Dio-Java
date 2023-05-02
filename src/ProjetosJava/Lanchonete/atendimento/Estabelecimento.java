package ProjetosJava.Lanchonete.atendimento;

import ProjetosJava.Lanchonete.area.cliente.Cliente;
import ProjetosJava.Lanchonete.atendimento.cozinha.Almoxarife;
import ProjetosJava.Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main (String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}
