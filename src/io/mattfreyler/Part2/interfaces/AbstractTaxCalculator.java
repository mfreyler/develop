package io.mattfreyler.Part2.interfaces;

public abstract class AbstractTaxCalculator implements TaxCalculator {
  protected double getTaxableIncome(double income, double expenses) {
    return income - expenses;
  }
}
