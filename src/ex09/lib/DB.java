package ex09.lib;

public interface DB {
    void setUrl(String url);
    int excute(String sql);
}
