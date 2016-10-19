package FactoryMethod;

public class Play2 extends ConsolesGerais implements Console {

    @Override
    public String exibirInfo() {
        setMarca("Sony");
        return "Console: Playstation 2\nMarca: " + getMarca()+ "\n\nCadastrado com sucesso!!!";
    }

}
