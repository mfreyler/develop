package io.mattfreyler.Part3;

import io.mattfreyler.Part3.generics.GenericList;
import io.mattfreyler.Part3.generics.User;

public class Main {
  public static void main(String[] args) {
    GenericList<User> users = new GenericList<>();
    users.add(new User());
    User user = users.get(0);
    System.out.println(user);
  }
}
