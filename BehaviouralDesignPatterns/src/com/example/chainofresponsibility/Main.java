package com.example.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        Request request1 = new Request(-1);
        Request request2 = new Request(5);
        Request request3 = new Request(15);
        Request request4 = new Request(25);

        handler1.handle(request1);
        handler1.handle(request2);
        handler1.handle(request3);
        handler1.handle(request4);
    }
}
