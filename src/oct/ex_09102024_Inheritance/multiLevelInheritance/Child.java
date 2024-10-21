package oct.ex_09102024_Inheritance.multiLevelInheritance;

public class Child extends Mother{

    @Override
    void home() {
        System.out.println("3BHK");
    }
    @Override
    void floor(){
        System.out.println("second floor");
    }
    void extra(){
        System.out.println("EXTRA");
    }
}
