package io.mattfreyler.Part3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
  public static void show() {
    List<String> list = new ArrayList<>();
    //    list.add("a");
    //    list.add("b");
    //    list.add(0, "!");
    Collections.addAll(list, "!", "a", "b", "c", "d", "a");
    list.set(0, "A+");
    //    list.remove(1);
    System.out.println(list.subList(0, 4));
    System.out.println(list.indexOf("a"));
    System.out.println(list.lastIndexOf("a"));
    System.out.println(list.get(0));
    System.out.println(list.getClass());
  }
}

/*
Collection: Use if all we care about is an object that contains elements and we can add and remove elements
List: Use if our application requires us to care about the index position of the objects.
 */
