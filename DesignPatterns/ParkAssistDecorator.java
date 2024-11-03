
class ParkAssistDecorator extends VoertuigDecorator {
    public ParkAssistDecorator(Voertuig voertuig) {
        super(voertuig);
    }

    @Override
    public void printKenmerken() {
        voegKenmerktoe("Park Assist toegevoegd.");
    }
}