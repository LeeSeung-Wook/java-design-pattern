package ex03;

import ex03.lib.OuterRabbit;

// 어댑터 패턴 : 인터페이스에 맞게 변환해주는 역할
// 용도1 : 이미 만들어진 도구가 인터페이스가 맞지 않아서 변환해서 연결하기 위해
// 용도2 : 아직 만들지 않은 도구를 미리 연결하기 위해 (인터페이스가 없다면)
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        RabbitAdapter rabbit = new RabbitAdapter(new OuterRabbit());
        Doorman doorman = new Doorman();
        doorman.쫓아내(rabbit);
    }
}
