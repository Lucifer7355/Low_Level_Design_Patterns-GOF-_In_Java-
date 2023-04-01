package com.example.state;

class Context {
    private State state;

    public Context() {
        state = new State1();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }
}