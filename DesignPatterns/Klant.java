
// Klant klasse die een facade biedt voor de interactie tussen klant en dealer
class Klant {
    private Dealer dealer;
 
    public Klant(Dealer dealer) {
        this.dealer = dealer; // Koppel de dealer aan de klant
    }
 
    public Voertuig vraagVoertuigAan(int motorOptie, int kleurOptie, int slotOptie, int versnellingsbakOptie) {
        Voertuig voertuig = dealer.getVoertuig(motorOptie, kleurOptie, slotOptie, versnellingsbakOptie);
        return voertuig;
    }
}
