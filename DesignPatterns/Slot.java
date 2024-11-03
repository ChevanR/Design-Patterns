// Slot abstracte klasse
abstract class Slot {
  protected boolean statusSlot;

  public abstract void unlockVervoermiddel();

  public abstract void lockVervoermiddel();
}