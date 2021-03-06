package dong.service.Impl;

import dong.dao.CareMapper;
import dong.dao.ConnectionMapper;
import dong.dao.FollowMapper;
import dong.dao.UserMapper;
import dong.model.Care;
import dong.model.Connection;
import dong.model.Follow;
import dong.model.User;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

    private UserMapper userMapper;
    private CareMapper careMapper;
    private FollowMapper followMapper;
    private ConnectionMapper connectionMapper;

    public CareMapper getCareMapper() {
        return careMapper;
    }

    @Autowired
    public void setCareMapper(CareMapper careMapper) {
        this.careMapper = careMapper;
    }

    public FollowMapper getFollowMapper() {
        return followMapper;
    }

    @Autowired
    public void setFollowMapper(FollowMapper followMapper) {
        this.followMapper = followMapper;
    }

    public ConnectionMapper getConnectionMapper() {
        return connectionMapper;
    }

    @Autowired
    public void setConnectionMapper(ConnectionMapper connectionMapper) {
        this.connectionMapper = connectionMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public boolean userCanLoginIn(String userName, String userPassword) {
        List<User> users = userMapper.findAll();
        for(User u : users){
            if(u.getUserName().equals(userName)) {
                if(u.getUserPassword().equals(userPassword)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public User findUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public User findUserByUserName(String userName) {
        List<User> users = userMapper.findAll();
        for(User u : users){
            if(u.getUserName().equals(userName)) return u;
        }
        return null;
    }


    @Override
    public Connection findConnectionByUser(User user) {
        Connection c = connectionMapper.findByUserId(user.getUserId());
        return c;
    }

    @Override
    public boolean registerUser(User user) {
        int res = userMapper.insert(user);
        return res == 1;
    }

    @Override
    public boolean updateUserInformation(User user) {
        int res = userMapper.updateByPrimaryKey(user);
        return res == 1;
    }

    @Override
    public boolean createConnection(Connection connection) {
        int res = connectionMapper.insertSelective(connection);
        return res == 1;
    }

    @Override
    public boolean changePassword(User user) {
        int res = userMapper.updateByPrimaryKeySelective(user);
        return res == 1;
    }

    @Override
    public boolean deleteConnectionByUser(User user) {
        int res = connectionMapper.deleteByUserId(user.getUserId());
        return res == 1;
    }
}
