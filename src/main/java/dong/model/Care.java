package dong.model;

import java.util.Date;

public class Care {
    private Integer careId;

    private Integer userId;

    private Integer bookerId;

    private Date careTime;

    public Integer getCareId() {
        return careId;
    }

    public void setCareId(Integer careId) {
        this.careId = careId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookerId() {
        return bookerId;
    }

    public void setBookerId(Integer bookerId) {
        this.bookerId = bookerId;
    }

    public Date getCareTime() {
        return careTime;
    }

    public void setCareTime(Date careTime) {
        this.careTime = careTime;
    }
}