package IDM;



public class TamkStaffClass extends Identity{

    public TamkStaffClass() {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please choose your university. 1 for TAMK, 2 for TAU.");
        // Institution = in.nextInt();
        tamkstaff = new TamkStaffFunction();
    }

    public void setUserID() {
        userID = FName + "." +LName;
    }

    public void setOrgEmail() {
        OrgEmail = FName +"."+LName+"@tuni.fi";
    }

    public void setStatus() {
        Status="PREMIE";
    }

    public void setServices() {
        Services = "HR,O365,INTRA";
    }

}
