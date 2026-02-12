package ex08.student;

public class MathStudent implements Student{

    private static final String NAME = "MATH";

    public void doHomework() {
        System.out.println("수학 숙제를 합니다.");
    }

    public boolean isSameHomework(String keyboard) {
        return NAME.equals(keyboard.toUpperCase());
    }
}
