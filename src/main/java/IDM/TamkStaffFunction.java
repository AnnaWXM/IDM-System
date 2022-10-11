package IDM;

public class TamkStaffFunction implements TAMKSTAFF{
    private String DisplayName;
    private String TAMKservices;


    public String setDisplayName(String name) {
        this.DisplayName = name+"(TAMK)";
        return DisplayName;
    }


    public String setServices() {
        TAMKservices = "PEPPI";
        return TAMKservices;
        
    }


}
