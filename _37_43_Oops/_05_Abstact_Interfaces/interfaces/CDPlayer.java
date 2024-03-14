package DsaProgress._37_43_Oops._05_Abstact_Interfaces.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
