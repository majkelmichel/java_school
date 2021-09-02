package me.majkelmichel.helloworld.abstractfactory;

public class CapitalizedHelloWorldFactory extends AbstractFactory {
    @Override
    public HelloWorld getHelloWorld(boolean exclaimed) {
        if (exclaimed) {
            return new CapitalizedExclamationHelloWorld();
        } else {
            return new CapitalizedHelloWorld();
        }
    }
}
