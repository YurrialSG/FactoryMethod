package FactoryMethod;

import java.util.ArrayList;

public class Fabricas extends ConsolesGerais implements FabricaDeConsole {

    @Override
    public Console criarConsole(String console) {
        switch (console) {
            case "playstation 2":
            case "playstation2":
            case "play 2":
            case "play2":
                listaDeConsoles.add("Playstation 2");
                return new Play2();
            case "playstation 3":
            case "playstation3":
            case "play 3":
            case "play3":
                listaDeConsoles.add("Playstation 3");
                return new Play3();
            case "playstation 4":
            case "playstation4":
            case "play 4":
            case "play4":
                listaDeConsoles.add("Playstation 4");
                return new Play4();
            case "xbox 360":
            case "xbox360":
                listaDeConsoles.add("Xbox 360");
                return new Xbox360();
            case "xbox one":
            case "xboxone":
                listaDeConsoles.add("Xbox One");
                return new XboxOne();
            default:
                return new Erro();
        }
    }

    @Override
    public ArrayList listarConsoles() {
        return listaDeConsoles;
    }

    @Override
    public int totalArrayConsoles() {
        int saida = listaDeConsoles.size();
        return saida;
    }

    @Override
    public String limparArrayConsoles() {
        listaDeConsoles.clear();
        return "Lista de consoles foi apagada.";
    }

    @Override
    public String excluirConsole(String consoleExlcuir) {
        switch (consoleExlcuir) {
            case "playstation 2":
            case "playstation2":
            case "play 2":
            case "play2":
                listaDeConsoles.remove("Playstation 2");
                return "Playstation 2 foi excluido!";
            case "playstation 3":
            case "playstation3":
            case "play 3":
            case "play3":
                listaDeConsoles.remove("Playstation 3");
                return "Playstation 3 foi excluido!";
            case "playstation 4":
            case "playstation4":
            case "play 4":
            case "play4":
                listaDeConsoles.remove("Playstation 4");
                return "Playstation 4 foi excluido!";
            case "xbox 360":
            case "xbox360":
                listaDeConsoles.remove("Xbox 360");
                return "Xbox 360 foi excluido!";
            case "xbox one":
            case "xboxone":
                listaDeConsoles.remove("Xbox One");
                return "Xbox One foi excluido!";
            default:
                return "Console não pode ser excluido...";
        }
    }
}
