package oct.ex_09102024_Inheritance.inheritance;

import oct.ex_09102024_Inheritance.hierarchial.Lucky;
import oct.ex_09102024_Inheritance.hierarchial.Pramod;
import oct.ex_09102024_Inheritance.hierarchial.Ruhani;
import oct.ex_09102024_Inheritance.hierarchial.Father;


public class Lab118 {
    public static void main(String[] args) {
Ruhani r= new Ruhani();
r.r1();
r.home();

        Lucky l= new Lucky();
        l.l2();
        l.home();

        Pramod p=new Pramod();
        p.home();
        p.h2();

        Father f=new Father();
        f.home();

    }
}
