public class MCU {

  /**
   */
  public static void main(String[] args) {
    Titan thanos = new Titan("Thanos", "Earth");
    PowerStone powerStone = PowerStone.getPowerStone(thanos);
    SpaceStone spaceStone = SpaceStone.getSpaceStone(thanos);
    spaceStone.setNewLocation("Knowhere");

    thanos.addStone(powerStone);
    thanos.addStone(spaceStone);

    for (int i = 0; i < 4; i++) {
      thanos.useGauntlet();
    }

    thanos.removeStone(spaceStone);
    thanos.removeStone(powerStone);

  }

}
