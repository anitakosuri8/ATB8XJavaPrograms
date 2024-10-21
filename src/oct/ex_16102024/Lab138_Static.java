package oct.ex_16102024;

class Student {
        int age; // Instance Variable (Non Static)
        static String school_name = "ABC"; // Static Variable


        {
            System.out.println("IIB");
            System.out.println("Here you can write a code what you want to do when Object is created");
            System.out.println("Read a MySQL db()");
        }

        static {
            System.out.println("SIB");
            System.out.println("Loaded Once, When Class is Laoded.");

        }


        public Student(int age) {
            this.age = age;
        }
    }

