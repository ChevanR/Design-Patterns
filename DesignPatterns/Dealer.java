// Dealer klasse die een facade biedt voor de interactie tussen dealer en fabriek
class Dealer {
  private Fabriek fabriek;

  public Dealer(Fabriek fabriek) {
      this.fabriek = fabriek; // Dealer only interacts with Fabriek
  }

  public Voertuig getVoertuig(int motorOptie, int kleurOptie, int slotOptie, int versnellingsbakOptie) {
      return fabriek.createVoertuig(motorOptie, kleurOptie, slotOptie, versnellingsbakOptie);
  }
}