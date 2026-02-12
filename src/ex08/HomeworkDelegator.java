package ex08;

import ex08.student.HistoryStudent;
import ex08.student.MathStudent;
import ex08.student.ScienceStudent;
import ex08.student.Student;

import java.util.ArrayList;
import java.util.List;

// 어떤 숙제를 해야할지 정하는 것을 위임받았음!!
public class HomeworkDelegator {
    private List<Student> students = new ArrayList<>();

    public HomeworkDelegator() {
        students.add(new MathStudent());
        students.add(new MathStudent());
        students.add(new ScienceStudent());
        students.add(new HistoryStudent());
        students.add(new HistoryStudent());
        students.add(new HistoryStudent());
    }

    public void delegateHomework(String keyboard){
        students.stream()
                .filter(student -> student.isSameHomework(keyboard))
                .forEach(student -> student.doHomework());
    }
}
