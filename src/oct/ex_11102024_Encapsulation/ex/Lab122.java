package oct.ex_11102024_Encapsulation.ex;

public class Lab122 {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("Amit",100);
       // amit.bal=1000;
        //amit.setBal(10000);

        // This should allowed to only Admin

        // code to connect with mySQL
        //  Admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBal(50000,true);
//        admin.setBal(50000,false);
        System.out.println(admin.getName(are_you_admin));
    }
}
