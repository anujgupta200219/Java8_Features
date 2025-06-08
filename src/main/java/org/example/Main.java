package org.example;

public class Main implements functionalinterface{
    public void hello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.hello();
        m.bye();
        functionalinterface.ok();
    }
}

