package FactoryMethod;

public class Play3 extends ConsolesGerais implements Console {

    @Override
    public String exibirInfo() {
        setMarca("Sony");
        return "Console: Playstation 3\nMarca: " + getMarca()+ "\n\nCadastrado com sucesso!!!";
    }

}
