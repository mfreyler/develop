package io.mattfreyler.Part2.MyTube;

public class MP4Encoder implements VideoEncoder {
  @Override
  public void encode(Video video) {
    System.out.println("Encoding video...");
    System.out.println("Done!\n");
  }
}
