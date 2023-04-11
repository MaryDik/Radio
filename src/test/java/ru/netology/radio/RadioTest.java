package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void RadioStationSwitching() {
        Radio cond = new Radio(30);

        cond.setRadioStation(1);

        Assertions.assertEquals(1, cond.getRadioStation());

    }

    @Test
    public void RadioStationSwitching1() {
        Radio cond = new Radio(30);

        cond.setRadioStation(31);

        Assertions.assertEquals(0, cond.getRadioStation());

    }

    @Test
    public void RadioStationSwitchingMinus() {
        Radio cond = new Radio();

        cond.setRadioStation(-3);

        Assertions.assertEquals(0, cond.getRadioStation());

    }

    @Test
    public void RadioStationSwitchingZer0() {
        Radio cond = new Radio(30);

        cond.setRadioStation(0);
        Assertions.assertEquals(0, cond.getRadioStation());

    }

    @Test
    public void RadioStationSwitchingNormal() {
        Radio cond = new Radio(30);
        cond.setRadioStation(1);
        Assertions.assertEquals(2, cond.nexRadioStation());
    }

    @Test
    public void RadioStationSwitching4() {
        Radio cond = new Radio(30);
        cond.setRadioStation(5);
        Assertions.assertEquals(4, cond.prevRadioStation());

    }

    @Test
    public void RadioStationSwitchingOnMax() {
        Radio cond = new Radio(30);

        cond.setRadioStation(29);

        Assertions.assertEquals(0, cond.nexRadioStation());

    }

    @Test
    public void RadioStationSwitchingOnMin() {
        Radio cond = new Radio();

        cond.setRadioStation(0);

        Assertions.assertEquals(9, cond.prevRadioStation());

    }

    @Test
    public void SwitchingTheSound() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-2);

        Assertions.assertEquals(0, cond.getCurrentVolume());

    }

    @Test
    public void SwitchingTheSound2() {
        Radio cond = new Radio();


        cond.setCurrentVolume(100);
        Assertions.assertEquals(100, cond.getCurrentVolume());
    }

    @Test
    public void SwitchingTheSound3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        Assertions.assertEquals(0, cond.getCurrentVolume());

    }

    @Test
    public void AddingVolume2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        Assertions.assertEquals(100, cond.getCurrentVolume());

    }


    @Test
    public void LowerTheSound1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        Assertions.assertEquals(99, cond.decreaseVolume());
    }

    @Test
    public void LowerTheSound2() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        Assertions.assertEquals(0, cond.decreaseVolume());
    }

    @Test
    public void LowerTheSound3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        Assertions.assertEquals(0, cond.decreaseVolume());
    }

    @Test
    public void AddingVolumeNew() {
        Radio cond = new Radio();

        cond.setCurrentVolume(2);


        Assertions.assertEquals(3, cond.increaseVolume());

    }

    @Test
    public void AddingVolumeNew1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        Assertions.assertEquals(100, cond.increaseVolume());

    }

    @Test
    public void AddingVolumeNew3() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);

        Assertions.assertEquals(100, cond.increaseVolume());

    }

}

