package controller;

import app.App;
import model.Converter;

public class Controller {
  private Converter converter = new Converter();

  public void convert(String _value, String currencyIn, String currencyOut) {
    float value;
    try {
      value = Float.parseFloat(_value);
    } catch (Exception e) {
      App.setOutput("Please use valid format in the text field");
      return;
    }
    if (currencyIn == null || currencyOut == null) {
      App.setOutput("Please select both currencies.");
      return;
    }
    String output = converter.convert(value, currencyIn, currencyOut);

    App.setOutput(output);
  }
}
