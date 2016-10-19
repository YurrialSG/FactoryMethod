package FactoryMethod;

public class Play4 extends ConsolesGerais implements Console {

    @Override
    public String exibirInfo() {
        setMarca("Sony");
        return "Console: Playstation 4\nMarca: " + getMarca()+ "\n\nCadastrado com sucesso!!!";
    }
}
