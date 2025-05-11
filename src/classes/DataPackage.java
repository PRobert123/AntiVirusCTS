package classes;

public class DataPackage {
    String sourceIp;
    String destIp;
    String protocol;
    int destPort;
    boolean isPlainText;

    public DataPackage(String sourceIp, String destIp, String protocol, int destPort, boolean isPlainText) {
        this.sourceIp = sourceIp;
        this.destIp = destIp;
        this.protocol = protocol;
        this.destPort = destPort;
        this.isPlainText = isPlainText;
    }

    @Override
    public String toString() {
        return "DataPackage{" +
                "sourceIp='" + sourceIp + '\'' +
                ", destIp='" + destIp + '\'' +
                ", protocol='" + protocol + '\'' +
                ", destPort=" + destPort +
                ", isPlainText=" + isPlainText +
                '}';
    }
}
