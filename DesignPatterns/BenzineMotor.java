class BenzineMotor extends Motor {
  @Override
  public void startMotor() {
      this.statusMotor = true;
      System.out.println("Benzine motor gestart.");
  }

  @Override
  public void stopMotor() {
      this.statusMotor = false;
      System.out.println("Benzine motor gestopt.");
  }
}