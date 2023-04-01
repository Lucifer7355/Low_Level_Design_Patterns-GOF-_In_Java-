package com.example.chainofresponsibility;

public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    public void handle(Request request) {
        if (request.getValue() < 0) {
            System.out.println("Negative values are not handled by ConcreteHandler1.");
        } else if (request.getValue() < 10) {
            System.out.println("Request " + request.getValue() + " handled by ConcreteHandler1.");
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("End of chain reached, request " + request.getValue() + " could not be handled.");
        }
    }
}
