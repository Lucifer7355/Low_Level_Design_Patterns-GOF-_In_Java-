package com.example.momento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.addMemento(originator.saveState());

        originator.setState("State 3");
        caretaker.addMemento(originator.saveState());

        originator.setState("State 4");
        System.out.println("Current State: " + originator.getState());

        originator.restoreState(caretaker.getMemento(1));
        System.out.println("Restored State: " + originator.getState());

        originator.restoreState(caretaker.getMemento(0));
        System.out.println("Restored State: " + originator.getState());
    }
}
