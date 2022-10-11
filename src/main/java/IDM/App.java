package IDM;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Identity A = new TauStudent();
        A.setServices();
        System.out.println(A.tauSetDisplayName() + " is a student from tau, can use " + A.tauSetServices());

        Identity B = new TamkStaffClass();
        B.setServices();
        System.out.println(B.tamkSetDisplayName() +" is a staff from tamk, can use " + B.tamkStaffServices());

        Identity C = new Visitor();
        C.setServices();
        C.setDisplayName();
        
        System.out.println(C.getDisplayName()+" can use "+C.getServices());
        


        // System.out.println( "Hello World!" );
        // Staff staffA = new Staff();
        // staffA.setDisplayName();
        // staffA.setOrgEmail();
        // System.out.println("Let's email "+staffA.getDisplayName()+" by " +staffA.getOrgEmail());
        // Student studentA = new Student();
        // studentA.setDisplayName();
        // studentA.setServices();
        // System.out.println(studentA.getDisplayName()+" can use "+studentA.getServices());
        // Visitor visitorA = new Visitor();
        // visitorA.setDisplayName();
        // System.out.println(visitorA.getDisplayName() +" is a visitor");

    }
}
