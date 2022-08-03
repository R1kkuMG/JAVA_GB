package Messanger;

interface Chat {
    void sendMessage(Message msg, User client);

    void appendClient(User client);

    void banClient(User client);

    void appendModerator(User client);

    void leaveDiscord(User client);
}
