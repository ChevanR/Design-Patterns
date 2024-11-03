// Abstracte voertuigklasse, basis voor alle voertuigen
abstract class Voertuig {
  protected Motor motor;
  protected String kleur;
  protected Slot slot;
  protected Versnellingsbak versnellingsbak;

  public abstract void startMotor();

  public abstract void stopMotor();

  public void unlockVoertuig() {
      slot.unlockVervoermiddel();
  }

  public void lockVoertuig() {
      slot.lockVervoermiddel();
      System.out.println("Voertuig vergrendeld.");
  }

  public void setMotor(Motor motor) {
      this.motor = motor;
  }

  public void setSlot(Slot slot) {
      this.slot = slot;
  }

  public void setKleur(String kleur) {
      this.kleur = kleur;
  }

  public void setVersnellingsbak(Versnellingsbak versnellingsbak) {
      this.versnellingsbak = versnellingsbak;
  }

  public void printKenmerken() {
      System.out
              .println("Voertuig kenmerken: Motor: " + motor.getClass().getSimpleName() + ", Kleur: " + kleur + ", Slot: "
                      + slot.getClass().getSimpleName() + ", Versnellingsbak: " + versnellingsbak.getClass().getSimpleName());
  }
}
