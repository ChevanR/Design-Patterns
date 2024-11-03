
// Concrete Decorators
class GPSDecorator extends VoertuigDecorator {
    public GPSDecorator(Voertuig voertuig) {
        super(voertuig);
    }

    @Override
    public void printKenmerken() {
        voegKenmerktoe("GPS toegevoegd.");
    }
}