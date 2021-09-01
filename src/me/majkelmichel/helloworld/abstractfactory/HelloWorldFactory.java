package me.majkelmichel.helloworld.abstractfactory;

class HelloWorldFactory extends AbstractFactory {
    @Override
    public HelloWorld getHelloWorld() {
        return new World();
    }
}
