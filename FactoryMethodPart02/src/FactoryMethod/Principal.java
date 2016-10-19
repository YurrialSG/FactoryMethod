package FactoryMethod;

public class Principal {

    public static void main(String[] args) {
        Console consoleEscolhido;
        FabricaSony fabricaSony = new FabricaSony();
        FabricaMicrosoft fabricaMicrosoft = new FabricaMicrosoft();
        
        consoleEscolhido = fabricaSony.criarConsole();
        consoleEscolhido.exibirInfo();
        
        consoleEscolhido = fabricaMicrosoft.criarConsole();
        consoleEscolhido.exibirInfo();
    }
}
