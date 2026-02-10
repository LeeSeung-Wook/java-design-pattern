package ex02;

// 프록시 패턴
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        Doorman doorman = new DoormanProxy();
        doorman.쫓아내(mouse);
    }
}
