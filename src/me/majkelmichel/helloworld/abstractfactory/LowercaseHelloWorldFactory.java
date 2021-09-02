package me.majkelmichel.helloworld.abstractfactory;

public class LowercaseHelloWorldFactory extends AbstractFactory {
    @Override
    public HelloWorld getHelloWorld(boolean exclaimed) {
        if (exclaimed) {
            return new LowercaseExclamationHelloWorld();
        } else {
            return  new LowercaseHelloWorld();
        }
    }
}
