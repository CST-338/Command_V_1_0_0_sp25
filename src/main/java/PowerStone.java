/**
 * @author Drew "Dr.C" Clinkenbeard
 * <br>
 * This raises the power of a Person.
 *
 * created: 3/3/25
 * @since 0.1.0
 */
public class PowerStone implements IStone{

  private final double powerMultiplier = 1.5;
  private int powerUpCount = 0;
  Person owner;

  public PowerStone(Person owner) {
    this.owner = owner;
  }

  /**
   * This method uses powerMultiplier to increase the power of owner.
   * Increments powerUpCount so we can undo this later.
   */
  @Override
  public void activate() {
    System.out.printf("%s is powering up current power: %s%n",owner, owner.getPower());
    double currentPower = owner.getPower();
    currentPower = currentPower * powerMultiplier;
    powerUpCount++;
    owner.setPower(currentPower);
    System.out.printf("%s's new power is %s%n",owner, owner.getPower());
  }
}
