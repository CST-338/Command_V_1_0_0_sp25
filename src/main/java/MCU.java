public class MCU {

  public static void main(String[] args) {
    Titan thanos = new Titan("Thanos","Titan");
    PowerStone powerStone = PowerStone.getPowerStone(thanos);
    SpaceStone spaceStone = SpaceStone.getSpaceStone(thanos);
    thanos.addStone(powerStone);
    thanos.addStone(spaceStone);

    spaceStone.setNewLocation("Earth");

    for (int i = 0; i < 10; i++) {
      thanos.useGauntlet();
    }

    thanos.removeStone(powerStone);
    thanos.removeStone(spaceStone);

  }

}
