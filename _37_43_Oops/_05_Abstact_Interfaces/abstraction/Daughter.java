package DsaProgress._37_43_Oops._05_Abstact_Interfaces.abstraction;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I want to be an coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
