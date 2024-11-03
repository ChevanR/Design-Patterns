// Decorator abstracte klasse
abstract class VoertuigDecorator extends Voertuig {
    protected Voertuig voertuig;

    public VoertuigDecorator(Voertuig voertuig) {
        this.voertuig = voertuig;
    }

    @Override
    public void startMotor() {
        voertuig.startMotor();
    }

    @Override
    public void stopMotor() {
        voertuig.stopMotor();
    }

    @Override
    public void unlockVoertuig() {
        voertuig.unlockVoertuig();
    }

    @Override
    public void lockVoertuig() {
        voertuig.lockVoertuig();
    }

    protected void voegKenmerktoe(String kenmerk) {
        voertuig.printKenmerken();
        System.out.println("Extra: " + kenmerk);
    }

    @Override
    public void printKenmerken() {
        voertuig.printKenmerken();
    }
}