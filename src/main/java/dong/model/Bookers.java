package dong.model;

import java.util.Date;

public class Bookers {
    private Integer bookerId;

    private Integer userId;

    private Date createTime;

    private String bookerHead;

    private String bookerInfo;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBookerHead() {
        return bookerHead;
    }

    public void setBookerHead(String bookerHead) {
        this.bookerHead = bookerHead == null ? null : bookerHead.trim();
    }

    public String getBookerInfo() {
        return bookerInfo;
    }

    public void setBookerInfo(String bookerInfo) {
        this.bookerInfo = bookerInfo == null ? null : bookerInfo.trim();
    }

    @Override
    public String toString() {
        return "Bookers{" +
                "bookerId=" + bookerId +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", bookerHead='" + bookerHead + '\'' +
                ", bookerInfo='" + bookerInfo + '\'' +
                '}';
    }
}