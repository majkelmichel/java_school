package me.majkelmichel.helloworld.abstractfactory;

class LowercaseHelloWorld implements HelloWorld {
    @Override
    public void print() {
        System.out.println("hello world");
    }
}

