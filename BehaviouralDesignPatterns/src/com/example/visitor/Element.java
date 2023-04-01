package com.example.visitor;

interface Element {
    void accept(Visitor visitor);
}