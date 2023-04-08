package ru.netology.radio;

public class Radio {
    private int RadioStation;
    private int MaxRadioStation = 9;
    private int MinRadioStation = 0;
    private int currentVolume;

    public int getRadioStation() {
        return RadioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > MaxRadioStation) {
            return;
        }
        if (newRadioStation < MinRadioStation) {
            return;
        }
        RadioStation = newRadioStation;
    }

    public void nexRadioStation() {
        if (RadioStation < MaxRadioStation) {
            RadioStation = RadioStation + 1;
        } else {
            RadioStation = MinRadioStation;
        }
    }

    public void prevRadioStation() {
        if (RadioStation > MinRadioStation) {
            RadioStation = RadioStation - 1;
        } else {
            RadioStation = MaxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}