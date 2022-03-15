package ru.netology.domain;

public class Radio {

    private final int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int currentNumberStation = 5;
    private int currentSoundVolume = 50;


    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public void numberStationEntered(int currentNumberStation) {
        if (currentNumberStation >= maxNumberStation) {
            this.currentNumberStation = maxNumberStation;
            return;
        }
        if (currentNumberStation <= minNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void numberStationNext() {
        if (currentNumberStation == maxNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;
        }
        currentNumberStation++;
    }

    public void numberStationPrev() {
        if (currentNumberStation == minNumberStation) {
            currentNumberStation = maxNumberStation + 1;
        }
        currentNumberStation--;
    }

    public void volumeStationUp() {
        int maxSoundVolume = 100;
        if (currentSoundVolume >= maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
        } else {
            currentSoundVolume++;
        }

    }

    public void volumeStationDon() {
        int minSoundVolume = 0;
        if (currentSoundVolume <= minSoundVolume) {
            currentSoundVolume = minSoundVolume;
        } else {
            currentSoundVolume--;
        }
    }

}