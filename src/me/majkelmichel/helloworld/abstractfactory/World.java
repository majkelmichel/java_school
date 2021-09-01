package me.majkelmichel.helloworld.abstractfactory;

class World implements HelloWorld {
    @Override
    public void print() {
        System.out.println("Hello World");
    }
}
