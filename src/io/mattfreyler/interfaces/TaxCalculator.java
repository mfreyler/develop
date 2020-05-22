package io.mattfreyler.interfaces;

public interface TaxCalculator {
  // Interfaces should be small and light-weight, so they are less likely to change
  // Java supports interface fields, but these should rarely be used because they are
  // implementation details --> Define constants in the implementation classes instead
  // float minimumTax = 100;

  double calculateTax();
}
