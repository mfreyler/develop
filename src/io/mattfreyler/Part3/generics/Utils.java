package io.mattfreyler.Part3.generics;

public class Utils {
  public static <T extends Comparable<T>> T max(T first, T second) {
    return (first.compareTo(second) < 0) ? second : first;
  }

  public static <K, V> void print(K key, V value) {
    System.out.println(key + "=" + value);
  }

  public static void printUser(User user) {
    System.out.println(user);
  }

  public static void printUsers(GenericList<? extends User> users) {
    // We can get something from the GenericList if we use the extends keyword, but we can't add to
    // it
    User x = users.get(0);

    // If we want to add to it, then we should use (GenericList<? super User> users) in the
    // signature.
    // But if we do this, we can't get something from it.
    // users.add()
  }
}
