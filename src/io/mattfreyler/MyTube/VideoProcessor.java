package io.mattfreyler.MyTube;

public class VideoProcessor {
  private VideoEncoder encoder;
  private VideoDatabase db;
  private NotificationService emailService;

  // constructor injection (dependency injection)
  public VideoProcessor(VideoEncoder encoder, VideoDatabase db, NotificationService emailService) {
    this.encoder = encoder;
    this.db = db;
    this.emailService = emailService;
  }

  public void process(Video video) {
    encoder.encode(video);
    db.store(video);
    emailService.sendEmail(video.getUser());
  }
}
