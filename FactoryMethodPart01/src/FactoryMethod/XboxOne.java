package FactoryMethod;

public class XboxOne extends ConsolesGerais implements Console {

    @Override
    public String exibirInfo() {
        setMarca("Microsoft");
        return "Console: Xbox One\nMarca: " + getMarca()+ "\n\nCadastrado com sucesso!!!";
    }
}
