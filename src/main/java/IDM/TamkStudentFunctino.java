package IDM;

public class TamkStudentFunctino implements TAMKSTUDENT{

    private String DisplayName;
    private String TAMKservices;

    public String setDisplayName(String name) {
        DisplayName = name+"(TAMK)";
        return DisplayName;
    }

    public String setServices() {
        TAMKservices = "PAKKI";
        return TAMKservices;
    }
    
}


