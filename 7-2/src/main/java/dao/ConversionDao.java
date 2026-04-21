package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import datasource.MariaDbConnection;
import model.Currency;

public class ConversionDao {
  public List<Currency> getAllCurrencies() {
    Connection conn = MariaDbConnection.getConnection();
    String sql = "SELECT currency, exchange_rate FROM currencies";
    List<Currency> currencies = new ArrayList<Currency>();
    try {
      Statement s = conn.createStatement();
      ResultSet rs = s.executeQuery(sql);

      while (rs.next()) {
        String name = rs.getString(1);
        Double exchangeRate = rs.getDouble(2);
        Currency currency = new Currency(name, exchangeRate);
        currencies.add(currency);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return currencies;
  }

  public Currency findByName(String currencyName) {
    Connection conn = MariaDbConnection.getConnection();
    Currency currency = null;
    try {
      PreparedStatement statement = conn
          .prepareStatement("SELECT currency, exchange_rate FROM currencies WHERE currency = ?");
      statement.setString(1, currencyName);
      ResultSet rs = statement.executeQuery();

      int count = 0;
      while (rs.next()) {
        count++;
        String name = rs.getString(1);
        Double exchangeRate = rs.getDouble(2);
        currency = new Currency(name, exchangeRate);
      }
      if (count != 1) {
        System.err.println("less or more than query should give");
        return null;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return currency;
  }
}
