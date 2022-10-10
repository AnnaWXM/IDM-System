package IDM;

public class TauClass implements TAU{

    private String DisplayName;
    private String TAMKservices;


    public String setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName+"(TAU)";
        return DisplayName;
    }


    public String setServices() {
        TAMKservices = "SISU";
        return TAMKservices;
        
    }

}
