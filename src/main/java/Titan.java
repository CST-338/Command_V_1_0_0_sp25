import java.util.ArrayList;
import java.util.List;

/**
 * @author Drew "Dr.C" Clinkenbeard
 * <br>
 * created: 3/3/25
 * @since 0.1.0
 */
public class Titan extends Person{

  private final List<IStone> gauntlet;

  public Titan(String name, String location) {
    this.setName(name);
    this.setLocation(location);
    gauntlet = new ArrayList<>();
  }

  public void useGauntlet(){
    for(IStone stone : gauntlet){
      stone.activate();
    }
  }

  @Override
  public boolean addStone(IStone stone) {
    if(gauntlet.contains(stone)){
      System.out.printf("%s already has the %s%n",getName(),stone);
      return false;
    }

    gauntlet.add(stone);
    System.out.printf("%s now has the %s%n",getName(),stone);
    return true;
  }

  @Override
  public boolean removeStone(IStone stone) {
    if(!gauntlet.contains(stone)){
      System.out.printf("%s does not have the %s%n",getName(),stone);
      return false;
    }

    gauntlet.remove(stone);
    System.out.printf("%s no longer has the %s%n",getName(),stone);
    return true;
  }
}
