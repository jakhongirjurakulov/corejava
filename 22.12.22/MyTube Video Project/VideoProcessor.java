package com.mytube;

public class VideoProcessor {
    private VideoEncoder videoEncoder;
    private VideoDatabase videoDatabase;
    private EmailService emailService;

    public VideoProcessor(VideoEncoder videoEncoder, VideoDatabase videoDatabase, EmailService emailService) {
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.emailService = emailService;
    }

    public void process(Video video) {
        videoEncoder.encode(video);
        videoDatabase.store(video);
        emailService.sendEmail(video.getUser());
    }
}

