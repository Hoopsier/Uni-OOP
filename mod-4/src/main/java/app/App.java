package app;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    try {
      calc.add(15);
    } catch (NegativeIntegerException e) {
      System.err.println(e);
    }
    System.out.println(calc.getValue());
    calc.reset();
    System.out.println(calc.getValue());

  }
}
