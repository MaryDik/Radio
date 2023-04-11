package ru.netology.radio;

public class Radio {
    private int minRadioStation = 0;
    private int radioStation = minRadioStation;
    private int defaultRadioStation = 10;
    private int maxRadioStation = defaultRadioStation - 1;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int size) {
        maxRadioStation = size - 1;
    }

    public Radio() {

    }

    public int getRadioStation() {

        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > maxRadioStation) {
            return;
        }
        if (newRadioStation < minRadioStation) {
            return;
        }
        radioStation = newRadioStation;
    }

    public int nexRadioStation() {
        if (radioStation < maxRadioStation) {
            radioStation = radioStation + 1;
               }
        else {
            radioStation = minRadioStation;
        }
        return radioStation;
    }

    public int prevRadioStation() {
        if (radioStation > minRadioStation) {
            radioStation = radioStation - 1;
        } else {
            radioStation = maxRadioStation;
        }
        return radioStation;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        }
      return currentVolume;

    }

        public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }


}