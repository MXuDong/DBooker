package dong.service.Impl;

import dong.dao.FollowMapper;
import dong.dao.UserMapper;
import dong.model.Follow;
import dong.model.User;
import dong.service.Interface.FollowService;
import org.springframework.stereotype.Service;

@Service("followService")
public class FollowServiceImpl implements FollowService {

    private UserMapper userMapper;
    private FollowMapper followMapper;

    @Override
    public boolean createFollow(Follow follow) {
        int res = followMapper.insert(follow);
        return  res == 1;
    }

    @Override
    public boolean deleteFollow(int followId) {
        int res = followMapper.deleteByPrimaryKey(followId);
        return res == 1;
    }

    @Override
    public User findFollowUser(Follow follow) {
        return userMapper.selectByPrimaryKey(follow.getUserId());
    }

    @Override
    public User findFollowedUser(Follow follow) {
        return userMapper.selectByPrimaryKey(follow.getBeFollowUserId());
    }
}
