package DsaProgress._37_43_Oops._05_Abstact_Interfaces.abstraction;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a doctor");
    }
    @Override
    void partner(){
        System.out.println("I love Diya");
    }
}
