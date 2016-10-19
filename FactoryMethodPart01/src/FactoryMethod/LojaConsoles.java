package FactoryMethod;

import javax.swing.JOptionPane;

public class LojaConsoles {

    String recebeConsole;
    String recebeConsoleExlcuir;
    String escolherMenu;
    int totalConsoles;

    public void executar() {
        Console consoleEscolhido;

        //Criação de Consoles
        Fabricas fabricas = new Fabricas();

        while (true) {
            escolherMenu = JOptionPane.showInputDialog(null, "Escolha uma da opções:\n"
                    + "1 - Cadastrar.\n"
                    + "2 - Listar Consoles Cadastrados.\n"
                    + "3 - Excluir Console.\n"
                    + "4 - Limpar Lista de Consoles.\n"
                    + "0 - Sair", "Factory Method em Java", 3);
            if (escolherMenu == null) {
                System.out.println("Sistema Finalizado...");
                break;
            } else {
                switch (escolherMenu) {
                    case "1":
                        recebeConsole = JOptionPane.showInputDialog(null, "Insira um novo console: ");
                        consoleEscolhido = fabricas.criarConsole(recebeConsole.toLowerCase());
                        JOptionPane.showMessageDialog(null, consoleEscolhido.exibirInfo(), "Cadastrar Console", 1);
                        continue;
                    case "2":
                        totalConsoles = fabricas.totalArrayConsoles();
                        if (totalConsoles == 0) {
                            JOptionPane.showMessageDialog(null, "Nenhum console cadastrado...", "Erro", 0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Nº de Consoles: " + fabricas.totalArrayConsoles()
                                    + "\n\nTodos os Consoles: " + fabricas.listarConsoles(), "Lista de Consoles", 1);
                        }
                        continue;
                    case "3":
                        totalConsoles = fabricas.totalArrayConsoles();
                        if (totalConsoles == 0) {
                            JOptionPane.showMessageDialog(null, "Nenhum console cadastrado...", "Erro", 0);
                        } else {
                            recebeConsole = JOptionPane.showInputDialog(null, "Insira o nome do console a ser excluido: ");
                            JOptionPane.showMessageDialog(null, fabricas.excluirConsole(recebeConsole.toLowerCase()), "Excluir Console", 1);
                        }
                        continue;
                    case "4":
                        totalConsoles = fabricas.totalArrayConsoles();
                        if (totalConsoles == 0) {
                            JOptionPane.showMessageDialog(null, "Nenhum console cadastrado...", "Erro", 0);
                        } else {
                            JOptionPane.showMessageDialog(null, fabricas.limparArrayConsoles(), "Lista de Consoles", 1);
                        }
                        continue;
                    case "0":
                        System.out.println("Sistema Finalizado...");
                        System.exit(0);
                }
            }
        }
    }
}
