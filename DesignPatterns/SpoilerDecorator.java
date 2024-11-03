class SpoilerDecorator extends VoertuigDecorator {
    public SpoilerDecorator(Voertuig voertuig) {
        super(voertuig);
    }

    @Override
    public void printKenmerken() {
        voegKenmerktoe("Spoiler toegevoegd.");
    }
}