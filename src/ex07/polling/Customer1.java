package ex07.polling;

public class Customer1 {

    // 상품 있어?
    public void request(LotteMart lotteMart) {
        String value = lotteMart.getValue();
        if(value != null) update(value);
    }

    // 있으면 알림 받기
    public void update(String msg) {
        System.out.println("손님1이 받은 알림 : " + msg);
    }
}
