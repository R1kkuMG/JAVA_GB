package Messanger;

public class Main {

    public static void main(String[] args) {
        Discord discord = new Discord();
        User client1 = new Moderator("Darth Vader", discord);
        User client2 = new User("Leia Organa", discord);
        User client3 = new User("Luke Skywalker", discord);
        discord.appendModerator(client1);
        discord.appendClient(client2);
        client1.sendMsg(new TextMessage ("hello"));
        discord.appendClient(client3);
        client1.sendMsg(new TextMessage ("hi"));
        User client4 = new User("The Emperor", discord);
        discord.appendClient(client4);
        client4.sendMsg(new AudioMessage ("You are rebels!"));
        client4.sendMsg(new TextMessage ("You are rebels!"));
        discord.leaveDiscord(client2);
        discord.leaveDiscord(client3);
        client1.sendMsg(new TextMessage ("Goodbye!"));
        discord.banClient(client4);
    }
}

