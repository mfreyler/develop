package io.mattfreyler.Part3;

import io.mattfreyler.Part3.generics.GenericList;
import io.mattfreyler.Part3.generics.Instructor;
import io.mattfreyler.Part3.generics.User;
import io.mattfreyler.Part3.generics.Utils;

public class Main {
  public static void main(String[] args) {
    var instructors = new GenericList<Instructor>();
    var users = new GenericList<User>();

    Utils.printUsers(new GenericList<Instructor>());
  }
}
