package controller;

import app.App;
import dao.ConversionDao;
import model.Converter;
import model.Currency;

public class Controller {
  private Converter converter = new Converter();
  private ConversionDao dao = new ConversionDao();

  public void convert(String _value, String currencyIn, String currencyOut) {
    float value;
    Currency currIn = dao.find(intHelper(currencyIn));
    Currency currOut = dao.find(intHelper(currencyOut));

    try {
      value = Float.parseFloat(_value);
    } catch (Exception e) {
      App.setOutput("Please use valid format in the text field");
      return;
    }
    if (currIn == null || currOut == null) {
      App.setOutput("Please select both currencies.");
      return;
    }
    String output = converter.convert(value, currIn, currOut);

    App.setOutput(output);
  }

  // I do not want to deal with this JAP error right now...
  private int intHelper(String name) {
    switch (name) {
      case "eur":
        return 1;
      case "gbp":
        return 2;
      case "usd":
        return 3;
    }
    return 0;
  }
}
