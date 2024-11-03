
class DieselMotor extends Motor {
  @Override
  public void startMotor() {
      this.statusMotor = true;
      System.out.println("Diesel motor gestart.");
  }

  @Override
  public void stopMotor() {
      this.statusMotor = false;
      System.out.println("Diesel motor gestopt.");
  }
}
