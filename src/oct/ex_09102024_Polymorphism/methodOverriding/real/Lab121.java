package oct.ex_09102024_Polymorphism.methodOverriding.real;

public class Lab121 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.home();

        Daddy dy  = new Daddy();
        dy.home();


        // Dynamic Dispatch
        Daddy object = new Daughter();
        object.home();

        // WebDriver driver = new ChromeDriver();

        // Not possible
        // Daughter object = new Daddy();

    }
}
