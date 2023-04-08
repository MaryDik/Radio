import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void RadioStationSwitching() {
        Radio cond = new Radio();

        cond.setRadioStation(1);

        int expected = 1;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitchingMinus() {
        Radio cond = new Radio();

        cond.setRadioStation(-3);

        int expected = 0;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitchingZer0() {
        Radio cond = new Radio();

        cond.setRadioStation(0);

        int expected = 0;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitchingMoreMax() {
        Radio cond = new Radio();

        cond.setRadioStation(15);

        int expected = 0;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitchingNormal() {
        Radio cond = new Radio();
        cond.setRadioStation(1);
        cond.nexRadioStation();
        int expected = 2;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitching4() {
        Radio cond = new Radio();

        cond.setRadioStation(5);
        cond.prevRadioStation();

        int expected = 4;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitchingOnMax() {
        Radio cond = new Radio();

        cond.setRadioStation(9);
        cond.nexRadioStation();

        int expected = 0;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RadioStationSwitchingOnMin() {
        Radio cond = new Radio();

        cond.setRadioStation(0);
        cond.prevRadioStation();

        int expected = 9;
        int actual = cond.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SwitchingTheSound() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-2);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SwitchingTheSound2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingTheSound3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AddingVolume1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(2);
        cond.increaseVolume();

        int expected = 3;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AddingVolume2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AddingVolume3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);
        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void LowerTheSound1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);
        cond.decreaseVolume();

        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowerTheSound2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowerTheSound3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);
        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

