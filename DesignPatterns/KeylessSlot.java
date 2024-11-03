class KeylessSlot extends Slot {
  @Override
  public void unlockVervoermiddel() {
      this.statusSlot = false;
      System.out.println("Keyless slot ontgrendeld.");
  }

  @Override
  public void lockVervoermiddel() {
      this.statusSlot = true;
      System.out.println("Keyless slot vergrendeld.");
  }
}