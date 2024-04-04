package bridge.messaging;

public class EmailImp implements MessageImp {
    public void sendMessage(String message) {
        System.out.println("Sending an email: " + message);
    }
}
