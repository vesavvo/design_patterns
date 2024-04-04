package bridge.messaging;

public class Main {
    public static void main(String[] args) {
        MessageImp email = new EmailImp();
        Message personalEmailMessage = new PersonalMessage(email);
        personalEmailMessage.send("Special offer for you! All items -20% only today.");

        MessageImp text = new SMSImp();
        Message businessTextMessage = new BusinessMessage(text);
        businessTextMessage.send("Stock value increases by 21% this quarter.");
    }
}
