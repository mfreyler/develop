package io.mattfreyler.interfaces;

public class Main {
  // We use interfaces in build loosely-coupled, extensible, testable applications.
  public static void main(String[] args) {
    var calculator = new TaxCalculator2018(100_000);
    var report = new TaxReport();
    report.show(calculator);
    report.show(new TaxCalculator2019());
  }
}
