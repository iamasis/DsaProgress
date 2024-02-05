package DsaProgress._37_Oops._05_Abstact_Interfaces.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();
    public NiceCar() {
        engine = new PowerEngine();
    }
    public void upgradeEngine (){
        this.engine = new Electricengine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
}
