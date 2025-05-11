package classes;

import java.util.Set;

public class AdvancedFirewall {
    private static final Set<String> SAFE_PROTOCOLS = Set.of("SSH","HTTPS","SSL");
    private static final Set<String> UNSAFE_PROTOCOLS = Set.of("telnet");

    public String analyze(DataPackage data){
        if(data.sourceIp.startsWith("192.168.")) return "safe";
        if(data.sourceIp.startsWith("27.")) return "unsafe";

        if(data.destIp.equals("192.168.0.1")) return "safe";

        if(SAFE_PROTOCOLS.contains(data.protocol.toUpperCase())) return "safe";
        if(UNSAFE_PROTOCOLS.contains(data.protocol.toLowerCase())) return "unsafe";

        if(data.destPort >=0 && data.destPort<=1023) return "safe";
        if(data.destPort >=49152 && data.destPort<=65536) return "unsafe";

        if(data.isPlainText) return  "safe";

        throw new IllegalArgumentException("Unknown data package status");
    }
}
