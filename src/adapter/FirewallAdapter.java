package adapter;

import classes.AdvancedFirewall;
import classes.DataPackage;
import interfaces.Firewallable;

public class FirewallAdapter implements Firewallable {
    private final AdvancedFirewall advancedFirewall = new AdvancedFirewall();
    @Override
    public void checkIfThisThingWillBlowUpOurComputers(Object something) {
        if(something instanceof DataPackage data){
            try{
                String result = advancedFirewall.analyze(data);
                System.out.println("The package is:"+result);
            }catch (IllegalArgumentException e){
                System.out.println("Error:"+e.getMessage());
            }
        }else{
            System.out.println("invalid data type. Expected DataPackage.");
        }
    }
}
