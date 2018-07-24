package dong.service;

import com.sun.javafx.tk.FontLoader;
import dong.model.Bookers;
import dong.model.Connection;
import dong.model.Follow;
import dong.model.User;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public interface UserServiceI {
    //能否登陆
    boolean userCanLoginIn(String userName, String userPassword);
    //通过ID查找User，不存在时返回null
    User findUserById(int userId);
    //通过userName查找user， 不存在时返回null
    User getUserByUserName(String userName);
    //查找某位用户的收藏的Booker
    List<Integer> getBookerIdFromUserCare(User user);
    //查找某位用户的关注
    List<Follow> getUserFollowBookerId(User user);
    //注册
    boolean registerUser(User user);
    //登陆
    boolean updateUserInformation(User user);
    //获取某位用户的Connection
    Connection getConnectionByUser(User user);

}
