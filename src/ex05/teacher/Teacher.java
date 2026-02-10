package ex05.teacher;

// 입장 -> 출석 -> 강의 -> 퇴장
public abstract class Teacher {
    public void 수업하기() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    private void 입장하기() {
        System.out.println("입장하기");
    }

    private void 출석부르기() {
        System.out.println("출석부르기");
    }

    // 구현체에서 구체적인 행위를 미루기
    protected abstract void 강의하기();

    private void 퇴장하기() {
        System.out.println("퇴장하기");
    }
}
