package io.mattfreyler.interfaces;

public class Dragger {
  public void drag(UIWidget draggable) {
    draggable.drag();
    System.out.println("Dragging done!");
  }
}
