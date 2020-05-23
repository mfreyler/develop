package io.mattfreyler.Part3.exceptions;

public class ExceptionsDemo {
  /*
   Checked
   Unchecked (runtime)
       - NullPointerException (trying to call a method on a null object)
       - ArithmeticException (divide by 0)
       - IllegalArgumentException (parameter you passed to a method was not correct/accepted)
       - IndexOutOfBoundsException (trying to access an element at a non-existent index)
       - IllegalStateException (trying to call a method on an object, but it is not in the correct state)
   Error (outside our program)
       - StackOverflow (out of memory) error
  */
  public static void show() {
    var account = new Account();
    try {
      account.withdraw(10);
    } catch (AccountException e) {
      var cause = e.getCause();
      System.out.println(cause.getMessage());
    }
  }
}
