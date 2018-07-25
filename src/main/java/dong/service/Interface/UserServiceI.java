package dong.service.Interface;

import dong.model.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public interface UserServiceI {
    //能否登陆
    boolean userCanLoginIn(String userName, String userPassword);
    //通过ID查找User，不存在时返回null
    User findUserById(int userId);
    //通过userName查找user， 不存在时返回null
    User findUserByUserName(String userName);
    //注册
    boolean registerUser(User user);
    //登陆
    boolean updateUserInformation(User user);
    //获取某位用户的Connection
    Connection findConnectionByUser(User user);
    //创建某位用户的Connection
    boolean createConnection(Connection connection);
    //修改密码
    boolean changePassword(User user);
}
