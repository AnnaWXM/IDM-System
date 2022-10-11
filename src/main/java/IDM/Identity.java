package IDM;

import java.util.Scanner;

public abstract class Identity implements IDMInterface{

    public String userID;
    public String OrgEmail;
    public String DisplayName;
    public int Institution;
    public String Services;
    public String Status;
    public String FName,LName;
    int count=001;

    TAMKSTUDENT tamkstudent;
    TAMKSTAFF tamkstaff;
    TAU tau;

    public Identity(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        FName = in.nextLine();
        System.out.println("Please enter your last name.");
        LName = in.nextLine();
    }

    public String tamkSetDisplayName(){
        String name = FName+" "+LName;
        DisplayName = tamkstaff.setDisplayName(name);
        return DisplayName;
    }

    public String tauSetDisplayName(){
        String name = FName+" "+LName;
        System.out.println(name);
        DisplayName = tau.setDisplayName(name);
        System.out.println(DisplayName);
        return DisplayName;
    }

    public String tamkStudentServices(){
        String FullService;
        FullService = getServices() + tamkstudent.setServices();
        return FullService;
    }

    public String tamkStaffServices(){
        String FullService;
        FullService = getServices() + tamkstaff.setServices();
        return FullService;
    }

    public String tauSetServices(){
        String FullService;
        FullService = Services + tau.setServices();
        return FullService;
    }
    
    public String getUserID(){
        return userID;
    }


    public String getOrgEmail() {
        return OrgEmail;
    }


    public String getDisplayName() {
        return DisplayName;
    }


    public String getServices() {
        return Services;
    }


    public String getStatus() {
        return Status;
    }

    public void setServices() {
    }

    public void setDisplayName() {
    }

    public void setOrgEmail() {
    }

    public void setUserID() {
    }

    public void setStatus() {
    }

}