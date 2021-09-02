package me.majkelmichel.helloworld;

import me.majkelmichel.helloworld.abstractfactory.AbstractFactory;
import me.majkelmichel.helloworld.abstractfactory.FactoryProducer;
import me.majkelmichel.helloworld.abstractfactory.HelloWorld;

public class EnterpriseHelloWorld {
    public static void main(String[] args) {
        AbstractFactory capitalizedHelloWorldFactory = FactoryProducer.getFactory(true); // gets capitalized factory

        HelloWorld capitalizedHelloWorld = capitalizedHelloWorldFactory.getHelloWorld(false);

        capitalizedHelloWorld.print(); // prints "Hello World"

        HelloWorld capitalizedExclaimedHelloWorld = capitalizedHelloWorldFactory.getHelloWorld(true);

        capitalizedExclaimedHelloWorld.print(); // prints "Hello World!"


        AbstractFactory lowercaseHelloWorldFactory = FactoryProducer.getFactory(false); // gets lowercase factory

        HelloWorld lowercaseHelloWorld = lowercaseHelloWorldFactory.getHelloWorld(false);

        lowercaseHelloWorld.print(); // prints "hello world"

        HelloWorld lowercaseExclaimedHelloWorld = lowercaseHelloWorldFactory.getHelloWorld(true);

        lowercaseExclaimedHelloWorld.print(); // prints "hello world!"
    }

}
