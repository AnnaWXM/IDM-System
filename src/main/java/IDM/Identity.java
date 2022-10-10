package IDM;

import java.util.Scanner;

public class Identity {

    public String userID;
    public String OrgEmail;
    public String DisplayName;
    public int Institution;
    public String Services;
    public String Status;
    public String FName,LName;
    int count=001;

    public Identity(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        FName = in.nextLine();
        System.out.println("Please enter your last name.");
        LName = in.nextLine();
        
        
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