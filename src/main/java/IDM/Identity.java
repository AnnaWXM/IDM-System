package IDM;

import java.util.Scanner;

public abstract class Identity {

    public String userID;
    public String OrgEmail;
    public String DisplayName;
    public int Institution;
    public String Services;
    public String Status;
    public String FName,LName;
    int count=001;

    TAMKSTUDENT tamk;
    TAU tau;

    public Identity(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        FName = in.nextLine();
        System.out.println("Please enter your last name.");
        LName = in.nextLine();
    }

    public void tamkSetDisplayName(){
        String name = FName+" "+LName;
        DisplayName = tamk.setDisplayName(name);
    }

    public void tauSetDisplayName(){
        String name = FName+" "+LName;
        DisplayName = tau.setDisplayName(name);
    }

    public void tamkSetServices(){
        
        tamk.setServices();
    }

    public void tauSetServices(){
        
        tau.setServices();
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

    // @Override
    // public void setUserID() {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void setOrgEmail() {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void setDisplayName() {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void setServices() {
    //     // TODO Auto-generated method stub
        
    // }

    // @Override
    // public void setStatus() {
    //     // TODO Auto-generated method stub
        
    // }



}