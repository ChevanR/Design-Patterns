
class VerchroomdeVelgenDecorator extends VoertuigDecorator {
    public VerchroomdeVelgenDecorator(Voertuig voertuig) {
        super(voertuig);
    }

    @Override
    public void printKenmerken() {
        voegKenmerktoe("Verchroomde velgen toegevoegd.");
    }
}