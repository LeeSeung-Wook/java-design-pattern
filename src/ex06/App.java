package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/**
 *     {
 *      "sends" : [basic, email],
 *       "msg": "반가워!!"
 *     }
 */

// 정의 : 기존에 있는 클래스(속옷)에 기능을 확장하면서 계속 추가하는 패턴
public class App {
    public static void main(String[] args) {
        // 1번 문제 (SMS알림, SMS알림, Email알림)
        Notifier en1 = new EmailNotifier(new SmsNotifier(new SmsNotifier()));
        en1.send();
        System.out.println();
        // 2번 문제 (기본알림, SMS알림, Email알림)
        Notifier en2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        en2.send();
        System.out.println();
        // 3번 문제 (SMS알림)
        Notifier sn = new SmsNotifier();
        sn.send();
    }
}
