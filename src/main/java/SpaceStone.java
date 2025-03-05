/**
* 
*
* @since 0.1.0
* @author Drew "Dr.C" Clinkenbeard
* <br>
 * It sets the owner's location, to a new location.
 * Keeps track of the old location to allow undoing.
 *
 *
* created: 3/5/25
*/public class SpaceStone implements IStone{

  private String oldLocation;
  private String newLocation;

  private Person owner;

  private static SpaceStone spaceStone;

  public static SpaceStone getSpaceStone(Person owner){
    if(spaceStone == null){
      spaceStone = new SpaceStone(owner);
    }
    return spaceStone;
  }

  private SpaceStone(Person owner){
    this.owner = owner;
  }

  @Override
  public void activate() {
    if(newLocation == null){
      System.out.println("No location to go to.");
      return;
    }

    if(owner.getLocation().equals(newLocation)){
      System.out.printf("%s is already at %s%n",owner.getName(), newLocation);
      return;
    }

    oldLocation = owner.getLocation();
    owner.setLocation(newLocation);

    System.out.printf("%s is now at %s%n",owner.getName(),newLocation);

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
}
