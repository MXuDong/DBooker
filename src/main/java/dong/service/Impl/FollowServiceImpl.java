package dong.service.Impl;

import dong.dao.FollowMapper;
import dong.dao.UserMapper;
import dong.model.Follow;
import dong.model.User;
import dong.service.Interface.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("followService")
public class FollowServiceImpl implements FollowService {

    private UserMapper userMapper;
    private FollowMapper followMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public FollowMapper getFollowMapper() {
        return followMapper;
    }

    @Autowired
    public void setFollowMapper(FollowMapper followMapper) {
        this.followMapper = followMapper;
    }

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
    public User findFollowUser(int followId) {
        Follow follow = findByFollowId(followId);
        return userMapper.selectByPrimaryKey(follow.getUserId());
    }

    @Override
    public User findFollowedUser(int followId) {
        Follow follow = findByFollowId(followId);
        return userMapper.selectByPrimaryKey(follow.getBeFollowUserId());
    }

    @Override
    public List<Follow> findAllByFollowUser(int userId) {
        List<Follow> res = followMapper.findAllByUserId(userId);
        return res;
    }

    @Override
    public List<Follow> findAllByBeFollowedUser(int userId) {
        List<Follow> res = followMapper.findAllByBeFollowUserId(userId);
        return res;
    }

    @Override
    public Follow findByFollowId(int followId) {
        Follow follow = followMapper.selectByPrimaryKey(followId);
        return follow;
    }
}
