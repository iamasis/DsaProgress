package DsaProgress._37_43_Oops._05_Abstact_Interfaces.interfaces;

public class Electricengine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerate");
    }
}
