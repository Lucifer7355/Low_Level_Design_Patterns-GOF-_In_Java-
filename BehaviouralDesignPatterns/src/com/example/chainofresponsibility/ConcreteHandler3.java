package com.example.chainofresponsibility;

public class ConcreteHandler3 implements Handler {
    private Handler nextHandler;

    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    public void handle(Request request) {
        if (request.getValue() >= 20 && request.getValue() < 30) {
            System.out.println("Request " + request.getValue() + " handled by ConcreteHandler3.");
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("End of chain reached, request " + request.getValue() + " could not be handled.");
        }
    }
}
