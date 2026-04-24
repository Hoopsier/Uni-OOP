package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "currencies", schema = "conversion")
public class Currency {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "currency")
  private String name;
  @Column(name = "exchange_rate")
  private double exchangeRate;

  public Currency() {
  }

  public Currency(String _name, double _exchangeRate) {
    name = _name;
    exchangeRate = _exchangeRate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getExchangeRate() {
    return exchangeRate;
  }
}
