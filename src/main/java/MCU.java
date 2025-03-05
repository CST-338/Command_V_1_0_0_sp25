public class MCU {

  /**
   */
  public static void main(String[] args) {
    Titan thanos = new Titan("Thanos");

    PowerStone powerStone = PowerStone.getPowerStone(thanos);

    thanos.addStone(powerStone);

    for (int i = 0; i < 4; i++) {
      thanos.useGauntlet();
    }

  }

}
