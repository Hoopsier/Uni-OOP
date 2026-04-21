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
    Currency currIn = dao.findByName(currencyIn);
    Currency currOut = dao.findByName(currencyOut);
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
}
