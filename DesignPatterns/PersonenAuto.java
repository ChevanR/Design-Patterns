// Concrete voertuigklasse: PersonenAuto
class PersonenAuto extends Voertuig {
  @Override
  public void startMotor() {
      motor.startMotor(); // This already prints the motor type, no need to specify "Auto motor gestart"
  }

  @Override
  public void stopMotor() {
      motor.stopMotor(); // Stop the motor
  }
}