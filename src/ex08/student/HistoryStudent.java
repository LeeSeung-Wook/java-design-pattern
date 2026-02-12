package ex08.student;

public class HistoryStudent implements Student{

    private static final String NAME = "HISTORY";

    @Override
    public void doHomework() {
        System.out.println("역사 숙제를 합니다");
    }

    @Override
    public boolean isSameHomework(String keyboard) {
        return NAME.equals(keyboard.toUpperCase());
    }
}
