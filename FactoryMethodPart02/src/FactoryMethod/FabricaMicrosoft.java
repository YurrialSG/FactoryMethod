
package FactoryMethod;

public class FabricaMicrosoft implements FabricaDeConsole {

    @Override
    public Console criarConsole() {
        return new Xbox360();
    }

}
