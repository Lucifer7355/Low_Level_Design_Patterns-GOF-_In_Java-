package com.example.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoomImpl();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);

        user1.sendMessage("Hi Bob!");
        user2.sendMessage("Hello Alice!");
    }
}