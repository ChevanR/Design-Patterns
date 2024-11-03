class VingerafdrukSlot extends Slot {
  @Override
  public void unlockVervoermiddel() {
      this.statusSlot = false;
      System.out.println("Vingerafdruk slot ontgrendeld.");
  }

  @Override
  public void lockVervoermiddel() {
      this.statusSlot = true;
      System.out.println("Vingerafdruk slot vergrendeld.");
  }
}
