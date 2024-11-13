package bridge.messaging;

public class PersonalMessage extends Message {
    public PersonalMessage(MessageImp ms) {
        super(ms);
    }

    public void send(String message) {
        System.out.println("Sending a personal message:");
        super.send(message);
    }
}
