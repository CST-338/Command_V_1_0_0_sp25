/**
 * @author Drew "Dr.C" Clinkenbeard
 * <br>
 * created: 3/5/25
 * @since 0.1.0
 */
public class SpaceStone implements IStone{

  private String oldLocation;
  private String newLocation;
  private Person owner;
  private static SpaceStone spaceStone;

  public static SpaceStone getSpaceStone(Person owner){
    if(SpaceStone.spaceStone == null){
      spaceStone = new SpaceStone(owner);
    }
    return spaceStone;
  }

  private SpaceStone(Person owner){
    this.owner = owner;
  }

  public String getOldLocation() {
    return oldLocation;
  }

  public void setOldLocation(String oldLocation) {
    this.oldLocation = oldLocation;
  }

  public String getNewLocation() {
    return newLocation;
  }

  public void setNewLocation(String newLocation) {
    this.newLocation = newLocation;
  }

  @Override
  public void activate() {
    if(newLocation == null){
      System.out.println("No location to move to.");
      return;
    }
    if(owner.getLocation().equals(newLocation)){
      System.out.printf("%s is already at %s%n",owner.getName(),newLocation);
      return;
    }
    oldLocation = owner.getLocation();
    System.out.printf("%s is moving from %s to %s%n",owner.getName(), oldLocation, newLocation);
    owner.setLocation(newLocation);
  }

  @Override
  public void deactivate() {
    if(oldLocation == null){
      System.out.println("No location to move to.");
      return;
    }
    if(owner.getLocation().equals(oldLocation)){
      System.out.printf("%s is already at %s%n",owner.getName(),oldLocation);
      return;
    }
    System.out.printf("%s is moving from %s to %s%n",owner.getName(), owner.getLocation(), oldLocation);
    owner.setLocation(oldLocation);
  }
}
