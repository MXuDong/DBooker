package dong.model;

import java.util.Date;

public class SpeakBooker {
    private Integer speakId;

    private Integer bookerId;

    private Integer userId;

    private Date speakTime;

    private String speakInfo;

    public Integer getSpeakId() {
        return speakId;
    }

    public void setSpeakId(Integer speakId) {
        this.speakId = speakId;
    }

    public Integer getBookerId() {
        return bookerId;
    }

    public void setBookerId(Integer bookerId) {
        this.bookerId = bookerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSpeakTime() {
        return speakTime;
    }

    public void setSpeakTime(Date speakTime) {
        this.speakTime = speakTime;
    }

    public String getSpeakInfo() {
        return speakInfo;
    }

    public void setSpeakInfo(String speakInfo) {
        this.speakInfo = speakInfo == null ? null : speakInfo.trim();
    }
}