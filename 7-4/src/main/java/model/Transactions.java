package model;

import jakarta.persistence.*;

@Entity
@Table(name = "conversion_transactions")
public class Transactions {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "from_currency_id", nullable = false)
  private Currency firstCurrency;

  @ManyToOne(optional = false)
  @JoinColumn(name = "to_currency_id", nullable = false)
  private Currency secondCurrency;

  @Column(name = "amountIn", nullable = false)
  private double amountIn;

  @Column(name = "amountOut", nullable = false)
  private double amountOut;

  public Transactions(Currency _firstCurrency, Currency _secondCurrency, double _amountIn, double _amountOut) {
    firstCurrency = _firstCurrency;
    secondCurrency = _secondCurrency;
    amountIn = _amountIn;
    amountOut = _amountOut;
  }

  public Transactions() {
  }

  public Currency getFirstCurrency() {
    return firstCurrency;
  }

  public Currency getSecondCurrency() {
    return secondCurrency;
  }

  public double getAmountIn() {
    return amountIn;
  }

  public double getAmountOut() {
    return amountOut;
  }

  public void setFirstCurrency(Currency _firstCurrency) {
    firstCurrency = _firstCurrency;
  }

  public void setSecondCurrency(Currency _secondCurrency) {
    secondCurrency = _secondCurrency;
  }

  public void setAmountIn(double _amountIn) {
    amountIn = _amountIn;
  }

  public void setAmountOut(double _amountOut) {
    amountOut = _amountOut;
  }
}
