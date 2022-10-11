package IDM;


public class TauStudent extends Identity{

    public TauStudent() {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please choose your university. 1 for TAMK, 2 for TAU.");
        // Institution = in.nextInt();
        tau = new TauFunction();
        
    }

    public void setServices() {
        Services = "O365, INTRA";
       

        // if(Institution==1){                             //Tamk student
        //     Services = "O365,INTRA,PAKKI";
        // }else {                                                //Tau student
        //     Services = "O365,INTRA,SISU";
        // }
    }
    
}
