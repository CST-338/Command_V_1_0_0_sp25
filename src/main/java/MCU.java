public class MCU {

  public static void main(String[] args) {
    Titan thanos = new Titan("Thanos","Titan");
    PowerStone powerStone = PowerStone.getPowerStone(thanos);
    thanos.addStone(powerStone);
    for (int i = 0; i < 10; i++) {
      thanos.useGauntlet();
    }
  }

}
