package bridge.messaging;

public abstract class Message {
    private MessageImp messageImp;

    public Message(MessageImp ms) {
        this.messageImp = ms;
    }

    public MessageImp getMessageImp() {
        return messageImp;
    }

    public void send(String message) {
        messageImp.sendMessage(message);
    }
}
