package DsaProgress._37_Oops._02_pack_static_singleton._02_Static;


//        FIRST CLASS

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
