package FactoryMethod;

public class Erro extends ConsolesGerais implements Console {

    @Override
    public String exibirInfo() {
        return "Console não pode ser cadastrado;";
    }

}
