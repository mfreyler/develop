package io.mattfreyler.Part3.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
  public static void show() {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("a");
    queue.add("b");
    var front = queue.poll();
    System.out.println(front);
    System.out.println(queue);
  }
}

/*
queue.add() --> add an item to a queue. Throws exception if the queue has a size limitation and it out of room when you try to add it
queue.offer() --> same as .add() for ArrayDeque(), but otherwise would return false if there was not space in the queue to add
queue.remove() --> removes an element from a beginning of queue. Throws exception if element doesn't exist
queue.poll() --> same as .remove(), except returns null if queue is empty, instead of throwing an exception
 */
