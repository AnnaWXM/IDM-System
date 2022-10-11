package IDM;

public class TauStudent extends Identity{

    public TauStudent() {
        tau = new TauFunction();
    }

    public void setServices() {
        Services = "O365, INTRA";
    }

    public void setOrgEmail() {
        OrgEmail = FName +"."+LName+"@tuni.fi";   
    }
    
}
