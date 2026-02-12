package ex06.notification;

// 속옷
public class BasicNotifier implements Notifier{

    private Notifier notifier; // 뭐든지 has 할수 있다.

    public BasicNotifier() {
    }

    public BasicNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        if(notifier != null) notifier.send();
        System.out.println("기본 알림");
    }
}
