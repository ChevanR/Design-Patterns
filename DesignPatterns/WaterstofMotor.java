class WaterstofMotor extends Motor {
  @Override
  public void startMotor() {
      this.statusMotor = true;
      System.out.println("Waterstof motor gestart.");
  }

  @Override
  public void stopMotor() {
      this.statusMotor = false;
      System.out.println("Waterstof motor gestopt.");
  }
}