package IDM;

public class TamkStudentClass implements TAMKSTUDENT{


    private String DisplayName;
    private String TAMKservices;


    public String setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName+"(TAMK)";
        return DisplayName;
    }


    public String setServices() {
        TAMKservices = "PAKKI";
        return TAMKservices;
        
    }



    
}


