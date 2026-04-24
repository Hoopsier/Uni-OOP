package model;

public class Converter {
  public String convert(float value, Currency currencyIn, Currency currencyOut) {
    double mult = currencyOut.getExchangeRate() / currencyIn.getExchangeRate();
    float out = value * (float) mult;
    return floatToString(out);
  }

  private String floatToString(float value) {
    return String.format("%.2f", value);
  }
}
