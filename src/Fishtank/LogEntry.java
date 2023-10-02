package Fishtank;

import java.time.LocalDateTime;
import java.util.Date;

public class LogEntry {
    private LocalDateTime feedingDate;
    private String waterQuality;
    private String comment;

    public LogEntry(LocalDateTime feedingDate, String waterQuality, String comment) {
        this.feedingDate = feedingDate;
        this.waterQuality = waterQuality;
        this.comment = comment;
    }

    public String getFeedingDate() {
        return feedingDate.toString();
    }

    public String getWaterQuality() {
        return waterQuality;
    }

    public String getComment() {
        return comment;
    }
}
