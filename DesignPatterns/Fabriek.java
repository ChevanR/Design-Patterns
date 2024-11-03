// Abstracte Fabriek klasse waarin het Factory Method pattern wordt gebruikt
abstract class Fabriek {
  public abstract Voertuig createVoertuig(int motorOptie, int kleurOptie, int slotOptie, int versnellingsbakOptie);
      
      // gedeelde methoden om onderdelen te maken
      protected Motor createMotor(int motorOptie) {
          switch (motorOptie) {
              case 1:
                  return new BenzineMotor();
              case 2:
                  return new DieselMotor();
              case 3:
                  return new WaterstofMotor();
              case 4:
                  return new ElektrischMotor();
              default:
                  return null;
          }
      }
      
      protected Slot createSlot(int slotOptie) {
          switch (slotOptie) {
              case 1:
                  return new MechanischSlot();
              case 2:
                  return new KeylessSlot();
              case 3:
                  return new VingerafdrukSlot();
              default:
                  return null;
          }
      }
      
      protected String createKleur(int kleurOptie) {
          switch (kleurOptie) {
              case 1:
                  return "Rood";
              case 2:
                  return "Blauw";
              case 3:
                  return "Zwart";
              default:
                  return "Onbekend";
          }
      }
      
      protected Versnellingsbak createVersnellingsbak(int versnellingsbakOptie) {
          switch (versnellingsbakOptie) {
              case 1:
                  return new Handgeschakeld();
              case 2:
                  return new Automaat();
              default:
                  return null;
          }
      }
}