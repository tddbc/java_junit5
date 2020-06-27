package tddbc;

public class ConsumptionTax implements Tax {
  double taxRate;

  public ConsumptionTax (double rate) {
    taxRate = rate;
  }

  public double calcurate(int price) {
    return price * taxRate;
  }
}