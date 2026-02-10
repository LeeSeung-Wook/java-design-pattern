package ex04;

public class Doorman {

    // 1. 이 코드는 단 한번만 실행된다.
    public static Doorman instance = new Doorman();

    private Doorman() {}

    // 책임
    public void 쫓아내(Animal a) {
        System.out.println(a.getName()+" 저리가");
    }
}
