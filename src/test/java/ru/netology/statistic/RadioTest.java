package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void createRadio() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(0, radio.getMinChannel());
        Assertions.assertEquals(19, radio.getMaxChannel());
        Assertions.assertEquals(0, radio.getCurrentChannel());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetChannelLessMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetChannelMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(radio.getMaxChannel() + 1);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelIfMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(radio.getMinChannel());
        radio.nextChannel();
        int expected = 1;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelIfMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(radio.getMaxChannel());
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelIfMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(radio.getMaxChannel());
        radio.prevChannel();
        int expected = radio.getMaxChannel() - 1;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelIfMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(radio.getMinChannel());
        radio.prevChannel();
        int expected = radio.getMaxChannel();
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
