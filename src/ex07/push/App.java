package ex07.push;

import ex07.push.pub.LotteMart;
import ex07.push.pub.Mart;
import ex07.push.sub.Cus1;
import ex07.push.sub.Cus2;
import ex07.push.sub.Customer;

/**
 *  push 방식 (옵저버패턴)
 *  1. 구현방식 정해져 있음
 *  2. 자바 lib : Reactive Java (자바9), Stomp(그 외)
 *  3. 스프링 : Stomp (WebSocket 라이브러리)
 */

public class App {
    public static void main(String[] args) {
        // 1. 객체 생성
        Mart lotteMart = new LotteMart();
        Customer c1 = new Cus1();
        Customer c2 = new Cus2();

        // 2. 구독
        lotteMart.add(c1);
        System.out.println("고객1 구독됨");
        lotteMart.add(c2);
        System.out.println("고객2 구독됨");

        // 3. 구독 취소
        lotteMart.remove(c1);
        System.out.println("고객1 구독취소");

        // 4. 출판
        System.out.println("롯데마트 입고 시작");
        lotteMart.received();
    }
}
