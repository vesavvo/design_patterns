package bridge.messaging;

public class SMSImp implements MessageImp {
    public void sendMessage(String message) {
        System.out.println("Sending an SMS: " + message);
    }
}
