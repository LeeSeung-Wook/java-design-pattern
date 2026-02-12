package ex09.lib;

public class MariaDB implements DB{

    private String path;

    @Override
    public void setUrl(String path) {
        this.path = path;
    }

    @Override
    public int excute(String sql) {
        if (path == null){
            System.out.println("path : null point error");
            return -1;
        }
        if (sql.equals("select")){
            System.out.println("query execute : " + path + "/" + sql);
            return 1;
        } else{
            System.out.println("query fail : syntax error");
            return -1;
        }
    }
}
