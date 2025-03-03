/**
 * @author Drew "Dr.C" Clinkenbeard
 * <br>
 * created: 3/3/25
 * @since 0.1.0
 */
public abstract class Person {

  private double power;
  private String name;
  private String location;

  public abstract boolean addStone(IStone stone);
  public abstract boolean removeStone(IStone stone);

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", power=" + power +
        ", location='" + location + '\'' +
        '}';
  }

  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
