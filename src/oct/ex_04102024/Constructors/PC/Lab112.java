package oct.ex_04102024.Constructors.PC;

public class Lab112 {
    public static void main(String[] args) {
        AHuman anita = new AHuman();
        AHuman pramod = new AHuman("Pramod");
        AHuman durga = new AHuman("Durga");
        System.out.println(anita.planet);
        System.out.println(pramod.planet);



        System.out.println(anita.name);
        System.out.println(pramod.name); // Pramod
        System.out.println(durga.name); // Durga
    }
}
