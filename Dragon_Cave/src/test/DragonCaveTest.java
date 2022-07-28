
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dragonCave;

    @BeforeEach
    void setUp() {
        dragonCave = new DragonCave();
    }

    @DisplayName("Test door number 1")
    @Test
    void chooseDoor() {
        dragonCave.setDoor(1);
        String expected = "Breaths fire to show you all of his treasure...\nYou take the treasure and become happily rich!\n";
        String result = dragonCave.chooseDoor("1");
        System.out.println(result);
        assertEquals(expected,result,"choosingDoor1 Test Failed");
    }

    @DisplayName("Test door number 2")
    @Test
    void chooseDoor2() {
        dragonCave.setDoor(2);
        String expected = "Breaths fire to show you all of his treasure...\nYou take the treasure and become happily rich!\n";
        String result = dragonCave.chooseDoor("2");
        System.out.println(result);
        assertEquals(expected,result,"choosingDoor2 Test Failed");
    }

    @DisplayName("Test when the wrong door is chosen")
    @Test
    void chooseWrongDoor() {
        dragonCave.setDoor(2);
        String expected = "Gobbles you down in one bite!\n";
        String result = dragonCave.chooseDoor("1");
        System.out.println(result);
        assertEquals(expected,result,"choosingWrongDoor Test Failed");
    }

    @DisplayName("Test Exception")
    @Test
    void chooseDoorException() {
        String expected = "User Bad Input!\n";
        String result = dragonCave.chooseDoor("1.6");
        System.out.println(result);
        assertEquals(expected,result,"Test Exception Failed");
    }

    @DisplayName("Test setting the correct door")
    @Test
    void setDoor() {
        dragonCave.setDoor(1);
        assertEquals(1,dragonCave.getDoor(),"setDoor method failed");
    }

    @DisplayName("Test getting the correct door")
    @Test
    void getDoor() {
        dragonCave.setDoor(2);
        assertEquals(2,dragonCave.getDoor(),"getDoor method failed");
    }

}