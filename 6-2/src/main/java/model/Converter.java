package model;

public class Converter {
  public String convert(float value, String currencyIn, String currencyOut) {
    switch (currencyIn) {
      case "eur":
        return convertE(value, currencyOut);
      case "usd":
        return convertU(value, currencyOut);
      case "pound":
        return convertP(value, currencyOut);
    }
    return "error";
  }

  // honestly faster to manual it for 3 than learn algorigthms just for this
  private String convertE(float value, String currency) {
    switch (currency) {
      case "usd":
        return floatToString(value * 1.18f);
      case "pound":
        return floatToString(value * 0.87f);
      default:
        return floatToString(value);
    }
  }

  private String convertU(float value, String currency) {
    switch (currency) {
      case "eur":
        return floatToString(value * 0.85f);
      case "pound":
        return floatToString(value * 0.74f);
      default:
        return floatToString(value);
    }
  }

  private String convertP(float value, String currency) {
    switch (currency) {
      case "usd":
        return floatToString(value * 1.35f);
      case "eur":
        return floatToString(value * 1.15f);
      default:
        return floatToString(value);
    }
  }

  private String floatToString(float value) {
    return String.format("%.2f", value);
  }
}
