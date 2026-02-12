package ex07.push.pub;

import ex07.push.sub.Customer;

public interface Mart {
    // 1. 구독자 등록
    void add(Customer customer);

    // 2. 출판(입고)
    void received();

    // 3. 알림 (구독자 update호출)
    void notify(String msg);

    // 4. 구독 취소
    void remove(Customer customer);
}
