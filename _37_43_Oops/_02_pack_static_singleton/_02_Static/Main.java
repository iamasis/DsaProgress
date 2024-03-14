package DsaProgress._37_43_Oops._02_pack_static_singleton._02_Static;



//              SECOND CLASS


public class Main {
    public static void main(String[] args) {
        Human akash = new Human(31, "Akash", 20000, false);
        Human amit = new Human(31, "Amit Kumar", 25000, true);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.greeting();

    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
        fun();
        System.out.println("Hello world");
    }
}