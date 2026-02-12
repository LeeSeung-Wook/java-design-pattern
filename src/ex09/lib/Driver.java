package ex09.lib;

public enum Driver {
    ORACLE("oracle"),
    MARIA("maria");

    private final String protocal;

    Driver(String protocal){
        this.protocal = protocal;
    }

    public String getProtocal() {
        return protocal;
    }
}
