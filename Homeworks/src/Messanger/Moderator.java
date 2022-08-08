package Messanger;

public class Moderator extends User {

    public Moderator(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public void banUser(User client) {
        this.getChatroom().banClient(client);
    }

    @Override
    public String getName() {
        return super.getName() + "[Moderator]";
    }
}
