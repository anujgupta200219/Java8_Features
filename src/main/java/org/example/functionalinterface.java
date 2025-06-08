package org.example;

@FunctionalInterface
public interface functionalinterface {
    public void hello();
    public default void bye(){
        System.out.println("bye");
    }
    public static void ok(){
        System.out.println("ok");
    }
}

