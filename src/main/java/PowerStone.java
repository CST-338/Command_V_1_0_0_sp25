/**
 * @author Drew "Dr.C" Clinkenbeard
 * <br>
 * PowerStone uses a field, powerModifer, to increase the
 * power attribute of a Person, owner.
 * created: 3/3/25
 * @since 0.1.0
 */
public class PowerStone implements IStone{
  private final double powerModifier = 1.5;
  private Person owner;
  //This is used to allow undo operations.
  private int activationCount = 0;

  @Override
  public void activate() {
    double currentPower = owner.getPower();
    System.out.printf("%s is powering up. Current power: %f%n", owner, currentPower);
    currentPower = currentPower * powerModifier;
    activationCount++;
    owner.setPower(currentPower);
    System.out.printf("%s has powered up. Current power: %f%n", owner, currentPower);
  }
}
