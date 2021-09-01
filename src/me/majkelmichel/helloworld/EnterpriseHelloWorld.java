package me.majkelmichel.helloworld;

import me.majkelmichel.helloworld.abstractfactory.AbstractFactory;
import me.majkelmichel.helloworld.abstractfactory.FactoryProducer;
import me.majkelmichel.helloworld.abstractfactory.HelloWorld;

public class EnterpriseHelloWorld {
    public static void main(String[] args) {
        AbstractFactory helloWorldFactory = FactoryProducer.getFactory();
        HelloWorld helloWorld = helloWorldFactory.getHelloWorld();

        helloWorld.print();
    }

}
