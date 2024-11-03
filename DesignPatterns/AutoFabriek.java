// AutoFabriek implementeert het Factory Method patroon door een Auto te creeren
class AutoFabriek extends Fabriek {
  @Override
  public Voertuig createVoertuig(int motorOptie, int kleurOptie, int slotOptie, int versnellingsbakOptie) {
      Voertuig voertuig = new PersonenAuto();
      voertuig.setMotor(createMotor(motorOptie));
      voertuig.setKleur(createKleur(kleurOptie));
      voertuig.setSlot(createSlot(slotOptie));
      voertuig.setVersnellingsbak(createVersnellingsbak(versnellingsbakOptie));
      return voertuig;
  }
}