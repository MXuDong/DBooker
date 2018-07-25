package dong.service.Interface;

import dong.model.Follow;
import dong.model.User;

import java.util.List;

public interface FollowService {
//    添加关注
    boolean createFollow(Follow follow);
//    取消关注
    boolean deleteFollow(int followId);
//    查看关注者
    User findFollowUser(int followId);
//    查看被关注者
    User findFollowedUser(int followId);
//    查看某个用户的关注列表
    List<Follow> findAllByFollowUser(int userId);
//    查看某个用户的被关注列表
    List<Follow> findAllByBeFollowedUser(int userId);
//    根据ID查找Follow
    Follow findByFollowId(int followId);
}

