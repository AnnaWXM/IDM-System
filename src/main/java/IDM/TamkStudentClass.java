package IDM;

public class TamkStudentClass extends Identity{

    public TamkStudentClass() {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please choose your university. 1 for TAMK, 2 for TAU.");
        // Institution = in.nextInt();
        tamkstudent = new TamkStudentFunctino();
    }
        
    public void setUserID() {
        userID = "ID"+ count;
        count++;
    }

      
    public void setOrgEmail() {
        OrgEmail = FName +"."+LName+"@tuni.fi";
    }

      
    public void setStatus() {
        Status="ACTIVE";
    }

    public void setServices() {
        Services = "O365,INTRA";
    }
    
}



