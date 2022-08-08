package Messanger;

import java.util.ArrayList;

class Discord implements Chat {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<User> banned = new ArrayList<>();
    ArrayList<User> moderators = new ArrayList<>();

    @Override
    public void sendMessage(Message text, User client) {
        if (!banned.contains(client)) {
            for (User user : users) {
                if (user.name != client.name) {
                    user.printMessage(text);
                }
            }
        } else {
            System.out.println("\n >>> " + client.getName() + " is banned");
        }
    }
    @Override
    public void appendClient(User client) {
        System.out.println("\n >>> " + client.getName() + " joined the channel");
        users.add(client);
    }

    @Override
    public void appendModerator(User client) {
        System.out.println("\n >>> " + client.getName() + " joined the channel");
        moderators.add(client);
    }

    @Override
    public void leaveDiscord(User client) {
        System.out.println("\n >>> " + client.getName() + " left the channel");
        users.remove(client);
    }

    @Override
    public void banClient(User client) {
        System.out.println("\n >>> " + client.name + " was removed from this channel");
        banned.add(client);
    }
}
