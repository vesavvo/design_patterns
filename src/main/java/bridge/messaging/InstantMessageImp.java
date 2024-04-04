package bridge.messaging;

public class InstantMessageImp implements MessageImp {
    public void sendMessage(String message) {
        System.out.println("Sending an instant message: " + message);
    }
}
