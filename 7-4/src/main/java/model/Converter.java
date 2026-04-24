package model;

import dao.ConversionDao;
import dao.TransactionDao;

public class Converter {
  public String convert(float value, Currency currencyIn, Currency currencyOut, TransactionDao transactionDao,
      ConversionDao cDao) {
    double mult = currencyOut.getExchangeRate() / currencyIn.getExchangeRate();
    float out = value * (float) mult;
    Transactions transaction = new Transactions(cDao.find(currencyIn.getId()),
        cDao.find(currencyOut.getId()),
        (double) value, (double) out);
    transactionDao.persist(transaction);
    return floatToString(out);
  }

  private String floatToString(float value) {
    return String.format("%.2f", value);
  }
}
