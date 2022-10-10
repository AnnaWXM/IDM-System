package IDM;

import java.util.Scanner;

public class Student extends Identity{

    public Student() {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please choose your university. 1 for TAMK, 2 for TAU.");
        // Institution = in.nextInt();
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


      
    // public void setDisplayName() {
    //     DisplayName = FName+" "+LName;

    //     // if(Institution ==1){                  //TAMK
    //     //     DisplayName = FName+" "+LName+"(TAMK)";
    //     //     System.out.println(DisplayName);
        
    //     // }else {                 //TAU
    //     //     DisplayName = FName+" "+LName+"(TAU)";
    //     //     System.out.println(DisplayName);
    //     // }
    //     // System.out.println(DisplayName);
        
    // }


      
    public void setServices() {
        Services = "O365,INTRA";

        // if(Institution==1){                             //Tamk student
        //     Services = "O365,INTRA,PAKKI";
        // }else {                                                //Tau student
        //     Services = "O365,INTRA,SISU";
        // }
    }
    
}



