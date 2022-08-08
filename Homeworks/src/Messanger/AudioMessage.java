package Messanger;

public class AudioMessage extends Message {
    private String audioText;

    // нужно придумать реализацию таких сообщений
    public AudioMessage(String audioText) {
        this.audioText = audioText;
    }

    @Override
    public String toString() {
        return audioText;
    }
}
