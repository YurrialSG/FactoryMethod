
package FactoryMethod;

public class FabricaSony implements FabricaDeConsole {

    @Override
    public Console criarConsole() {
        return new Play2();
    }

}
