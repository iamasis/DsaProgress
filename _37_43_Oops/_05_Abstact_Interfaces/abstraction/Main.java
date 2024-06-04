package DsaProgress._37_43_Oops._05_Abstact_Interfaces.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
//        son.career();

        Daughter daughter = new Daughter(25);
//        daughter.career();

//        Parent mom = new Parent();   YOU CANT CREATE AN OBJECT FOR AN ABSTRACT CLASS;
        // BUT YOU CAN USE STATIC
        Parent.hello();
    }
}
