class MechanischSlot extends Slot {
  @Override
  public void unlockVervoermiddel() {
      this.statusSlot = false;
      System.out.println("Mechanisch slot ontgrendeld.");
  }

  @Override
  public void lockVervoermiddel() {
      this.statusSlot = true;
      System.out.println("Mechanisch slot vergrendeld.");
  }
}