package dong.service.Interface;

import dong.model.Follow;
import dong.model.User;

public interface FollowService {
//    添加关注
    boolean createFollow(Follow follow);
//    取消关注
    boolean deleteFollow(int followId);
//    查看关注者
    User findFollowUser(Follow follow);
//    查看被关注者
    User findFollowedUser(Follow follow);

}

