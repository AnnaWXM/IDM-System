package IDM;

public class TamkStaffClass {
    private String DisplayName;
    private String TAMKservices;


    public String setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName+"(TAMK)";
        return DisplayName;
    }


    public String setServices() {
        TAMKservices = "PEPPI";
        return TAMKservices;
        
    }


}
