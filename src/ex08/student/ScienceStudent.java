package ex08.student;

public class ScienceStudent implements Student{

    private static final String NAME = "SCIENCE";

    public void doHomework() {
        System.out.println("과학 숙제를 합니다.");
    }

    public boolean isSameHomework(String keyboard) {
        return NAME.equals(keyboard.toUpperCase());
    }
}
