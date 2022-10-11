package IDM;

public class TauStaff extends Identity{

    public TauStaff() {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please choose your university. 1 for TAMK, 2 for TAU.");
        // Institution = in.nextInt();
        tau = new TauFunction();
        
    }
    
    public void setServices() {
        Services = "HR, O365, INTRA";   
    }

    public void setOrgEmail() {
        OrgEmail = FName +"."+LName+"@tuni.fi";   
    }

}
