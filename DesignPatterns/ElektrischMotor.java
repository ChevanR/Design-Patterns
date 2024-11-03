class ElektrischMotor extends Motor {
  @Override
  public void startMotor() {
    this.statusMotor = true;
    System.out.println("Elektrisch motor gestart.");
  }

  @Override
  public void stopMotor() {
    this.statusMotor = false;
    System.out.println("Elektrisch motor gestopt.");
  }
}