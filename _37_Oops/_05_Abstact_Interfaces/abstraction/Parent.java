package DsaProgress._37_Oops._05_Abstact_Interfaces.abstraction;

public abstract class Parent {
    int age;
    public Parent(int age){
        this.age = age;
    }
    static void hello(){
        System.out.println("Hello");
    }
    abstract void career();
    abstract void partner();
}
