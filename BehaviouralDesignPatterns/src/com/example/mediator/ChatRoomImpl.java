package com.example.mediator;

class ChatRoomImpl implements ChatRoom {
    public void sendMessage(String message, User user) {
        System.out.println(user.getName() + " sends message: " + message);
    }
}