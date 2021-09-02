package me.majkelmichel.helloworld.abstractfactory;

class LowercaseExclamationHelloWorld implements HelloWorld {
    @Override
    public void print() {
        System.out.println("hello world!");
    }
}
