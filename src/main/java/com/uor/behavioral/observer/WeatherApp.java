package com.uor.behavioral.observer;

public class WeatherApp {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();
    Observer phoneDisplay = new PhoneDisplay();
    Observer tvDisplay = new TVDisplay();

    weatherStation.addObserver(phoneDisplay);
    weatherStation.addObserver(tvDisplay);

    weatherStation.setWeather("Sunny");
    weatherStation.setWeather("Rainy");
  }
}
