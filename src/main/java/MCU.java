public class MCU {
//TODO: Add deactivate to Powerstone
//TODO: Make PowerStone a singleton
//TODO: Improve add remove/ i.e. not part of the constructor
//TODO: Implement SpaceStone
//TODO: Implement a new Person.

  public static void main(String[] args) {
    Titan thanos = new Titan("Thanos","Titan");
    //TODO: Make this so that we add the person when addStone is called.
    PowerStone powerStone = new PowerStone(thanos);
    thanos.addStone(powerStone);
    for (int i = 0; i < 10; i++) {
      thanos.useGauntlet();
    }
  }

}
