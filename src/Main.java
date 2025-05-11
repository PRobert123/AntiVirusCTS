import adapter.FirewallAdapter;
import classes.DataPackage;
import interfaces.Firewallable;

public class Main {
    public static void main(String[] args) {
        Firewallable firewall = new FirewallAdapter();
        DataPackage safePackage = new DataPackage("192.168.1.1","192.168.0.1","HTTPS",443,true);
        DataPackage unsafePackage = new DataPackage("27.1.1.1","192.168.0.1","telnet",60000,false);
        DataPackage unknownPackage = new DataPackage("10.0.0.1","192.168.0.2","FTP",70000,false);

        firewall.checkIfThisThingWillBlowUpOurComputers(safePackage);
        firewall.checkIfThisThingWillBlowUpOurComputers(unsafePackage);
        firewall.checkIfThisThingWillBlowUpOurComputers(unknownPackage);
    }
}