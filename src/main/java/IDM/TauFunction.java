package IDM;

public class TauFunction implements TAU{

    private String DisplayName;
    private String Tauservices;


    public String setDisplayName(String name) {
        DisplayName = name+"(TAU)";
        return DisplayName;
    }


    public String setServices() {
        Tauservices = ", SISU";
        return Tauservices;
        
    }

}
