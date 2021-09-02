package me.majkelmichel.helloworld.abstractfactory;

class CapitalizedHelloWorld implements HelloWorld {
    @Override
    public void print() {
        System.out.println("Hello World");
    }
}
