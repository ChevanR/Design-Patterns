
class AlarmsysteemDecorator extends VoertuigDecorator {
    public AlarmsysteemDecorator(Voertuig voertuig) {
        super(voertuig);
    }

    @Override
    public void printKenmerken() {
        voegKenmerktoe("Alarmsysteem toegevoegd.");
    }
}