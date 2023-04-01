package com.example.state;

class State2 implements State {
    public void doAction(Context context) {
        System.out.println("State 2");
        context.setState(new State1());
    }
}
