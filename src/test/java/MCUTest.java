import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MCUTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void sampleTest(){
    Titan titan = new Titan( "Thanos", "Earth");
    PowerStone powerStone = PowerStone.getPowerStone(titan);
   assertNotNull(powerStone);
  }
}