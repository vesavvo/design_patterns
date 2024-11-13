package bridge.messaging;

public class BusinessMessage extends Message {
    public BusinessMessage(MessageImp ms) {
        super(ms);
    }

    public void send(String message) {
        System.out.println("Sending a business message:");
        super.send(message);
    }
}
