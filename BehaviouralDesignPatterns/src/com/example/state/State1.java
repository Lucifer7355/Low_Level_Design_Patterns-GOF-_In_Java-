package com.example.state;

class State1 implements State {
    public void doAction(Context context) {
        System.out.println("State 1");
        context.setState(new State2());
    }
}
