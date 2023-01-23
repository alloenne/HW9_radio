package ru.netology.statistic;

public class Radio {

    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel = minChannel;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int number) {
        maxChannel = number - 1;
    }

    public Radio() {

    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minChannel) {
            return;
        }
        if (newCurrentChannel > maxChannel) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextChannel() {
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prevChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }
}




