package ex09;

import ex09.lib.DB;
import ex09.lib.Driver;

/**
 * 팩토리 패턴 예제!!
 */

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB db = factory.createDB(Driver.MARIA);
        db.excute("select");
    }
}
