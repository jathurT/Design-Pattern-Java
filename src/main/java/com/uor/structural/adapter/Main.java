package com.uor.structural.adapter;

public class Main {
  public static void main(String[] args) {
    IPhone6s iPhone6s = new IPhone6s(new Iphone4sTo6sAdapter(new IPhone4sCharger()));
    iPhone6s.onCharge();
  }
}
