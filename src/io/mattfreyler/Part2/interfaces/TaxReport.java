package io.mattfreyler.Part2.interfaces;

public class TaxReport {
  private TaxCalculator calculator;

  //  // constructor injection (dependency injection)
  //  public TaxReport(TaxCalculator calculator) {
  //    this.calculator = calculator;
  //  }

  // Method injection (dependency injection)
  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

  //  // setter injection (dependency injection)
  //  public void setCalculator(TaxCalculator calculator) {
  //    this.calculator = calculator;
  //  }
}
