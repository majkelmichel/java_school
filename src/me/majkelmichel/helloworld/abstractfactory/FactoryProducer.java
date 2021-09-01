package me.majkelmichel.helloworld.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new HelloWorldFactory();
    }
}
