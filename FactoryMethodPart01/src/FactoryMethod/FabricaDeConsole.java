package FactoryMethod;

import java.util.ArrayList;

public interface FabricaDeConsole {

    ArrayList listaDeConsoles = new ArrayList();
    
    Console criarConsole(String console) throws Exception;
    
    String excluirConsole(String console);
       
    ArrayList listarConsoles();
    
    int totalArrayConsoles();
    
    String limparArrayConsoles();
    
}
