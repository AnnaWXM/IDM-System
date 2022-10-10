package IDM;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Staff staffA = new Staff();
        staffA.setDisplayName();
        staffA.setOrgEmail();
        System.out.println("Let's email "+staffA.getDisplayName()+" by " +staffA.getOrgEmail());
        Student studentA = new Student();
        studentA.setDisplayName();
        studentA.setServices();
        System.out.println(studentA.getDisplayName()+" can use "+studentA.getServices());
        Visitor visitorA = new Visitor();
        visitorA.setDisplayName();
        System.out.println(visitorA.getDisplayName() +" is a visitor");

    }
}
