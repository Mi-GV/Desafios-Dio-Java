package ProjetosJava.Lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando Java.Lanche No Balcão");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando Suco No Balcão");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando Java.Lanche Tipo Hamburguer");
    }
    private void prepararVitamina(){
        System.out.println("Preparando Suco");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, queijo, hamburguer");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando frutas, leite, açúcar");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando Ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo Vitamina");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
