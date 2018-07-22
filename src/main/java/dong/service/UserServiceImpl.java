package dong.service;

import dong.dao.UserMapper;
import dong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public boolean userCanLoginIn(String UserName, String UserPassword) {
        List<User> users = userMapper.findAll();
        for(User u : users){
            if(u.getUserName().equals(UserName)) {
                if(u.getUserPassword().equals(UserPassword)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
}
