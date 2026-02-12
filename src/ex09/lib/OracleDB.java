package ex09.lib;

public class OracleDB implements DB{

    private String url;

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int excute(String sql) {
        if (sql.equals("select")){
            System.out.println("query execute : " + url + "/" + sql);
            return 1;
        } else{
            System.out.println("query fail : syntax error");
            return -1;
        }
    }
}
