package model;

public class Currency {
  private String name;
  private double exchangeRate;

  public Currency(String _name, double _exchangeRate) {
    name = _name;
    exchangeRate = _exchangeRate;
  }

  public String getName() {
    return name;
  }

  public double getExchangeRate() {
    return exchangeRate;
  }
}
