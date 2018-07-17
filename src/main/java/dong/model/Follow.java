package dong.model;

public class Follow {
    private Integer followId;

    private Integer userId;

    private Integer beFollowUserId;

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBeFollowUserId() {
        return beFollowUserId;
    }

    public void setBeFollowUserId(Integer beFollowUserId) {
        this.beFollowUserId = beFollowUserId;
    }
}