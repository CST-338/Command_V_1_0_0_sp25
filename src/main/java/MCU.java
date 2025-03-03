public class MCU {

  /**
   * TODO: Add toString to concrete implementations
   * Todo: Make Concrete IStones Singletons.
   * TODO: Make Deactivate in PowerStone
   * TODO: Implement SpaceStone
   * TODO: make a new implementation of person.
   */
  public static void main(String[] args) {
    Titan thanos = new Titan("Thanos");

    PowerStone powerStone = new PowerStone(thanos);

    thanos.addStone(powerStone);

    for (int i = 0; i < 4; i++) {
      thanos.useGauntlet();
    }

  }

}
