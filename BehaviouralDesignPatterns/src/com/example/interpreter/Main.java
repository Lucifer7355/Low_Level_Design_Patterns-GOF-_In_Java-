package com.example.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression john = new TerminalExpression("John");
        Expression married = new TerminalExpression("married");
        Expression and = new AndExpression(john, married);

        Context context = new Context("John is married");
        System.out.println(and.interpret(context.getContext())); // true

        context.setContext("Paul is single");
        System.out.println(and.interpret(context.getContext())); // false
    }
}