package Messanger;

public class User {

    String name;
    private Chat chatroom;

    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    public String getName () {
        return name;
    }

    public Chat getChatroom () {
        return chatroom;
    }

    void printMessage(Message msg) {
        System.out.printf("Chat %s: %s\n", name, msg);
    }

    void sendMsg(Message text) {
        chatroom.sendMessage(text, this);
    }
}
