package me.majkelmichel.helloworld.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean capitalized) {
        if (capitalized) {
            return new CapitalizedHelloWorldFactory();
        } else {
            return new LowercaseHelloWorldFactory();
        }
    }
}
