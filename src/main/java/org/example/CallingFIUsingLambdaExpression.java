package org.example;

public class CallingFIUsingLambdaExpression {
    public static void main(String args[]){
        functionalinterface2 fi=()->"Hello";
        System.out.println(fi.getname());

    }
}

