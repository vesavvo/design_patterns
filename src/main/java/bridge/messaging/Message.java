package bridge.messaging;

public abstract class Message {
    private MessageImp messageImp;

    public Message(MessageImp ms) {
        this.messageImp = ms;
    }

    public MessageImp getMessageImp() {
        return messageImp;
    }

    abstract void send(String message);
}
