package com.uor.structural.adapter;

public class IPhone6s implements IPhone {
  Charger iphoneCharger;

  public IPhone6s(Charger iphoneCharger) {
    this.iphoneCharger = iphoneCharger;
  }

  @Override
  public void onCharge() {
    iphoneCharger.charge();
  }
}
