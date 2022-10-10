package IDM;

public class Visitor extends Identity{
    

      
    public void setUserID() {
        userID = "ext."+FName+"."+LName;
    }

      
    public void setOrgEmail() {
        OrgEmail = null;
        
    }

      
    public void setStatus() {
        Status="INACTIVE";
        
    }

      
    public void setDisplayName() {
        DisplayName = FName+" "+LName+"(ext)";
    }

      
    public void setServices() {
        Services = "INTRA";
    }
}

