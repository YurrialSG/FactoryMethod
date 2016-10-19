package FactoryMethod;

public class Xbox360 extends ConsolesGerais implements Console {

    @Override
    public String exibirInfo() {
        setMarca("Microsoft");
        return "Console: Xbox 360\nMarca: " + getMarca()+ "\n\nCadastrado com sucesso!!!";
    }
}
