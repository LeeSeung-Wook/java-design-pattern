package ex06.notification;

public class SmsNotifier implements Notifier{

    private Notifier notifier; // 뭐든지 has 할수 있다.

    public SmsNotifier() {
    }

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        if(notifier != null) notifier.send();
        System.out.println("문자 알림");
    }
}
