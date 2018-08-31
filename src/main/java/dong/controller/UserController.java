package dong.controller;

import dong.model.Connection;
import dong.model.DefaultClass;
import dong.model.User;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceI userServiceI;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("")
    public ModelAndView defaultUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody
    User login(String userName, String password) {
        User user = new User();
        if (userServiceI.userCanLoginIn(userName, password)) {
            User res = userServiceI.findUserByUserName(userName);
            HttpSession session = request.getSession();
            session.setAttribute("userId", res.getUserId());
            user.setUserId(res.getUserId());
        }

        return user;
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public @ResponseBody
    User register(String userName, String password) {
        User user = userServiceI.findUserByUserName(userName);
        if (user == null) {
            user = new User();
            user.setUserName(userName);
            user.setUserPassword(password);
            user.setUserSex("M");
            userServiceI.registerUser(user);
            return new User();
        }
        User tmp = new User();
        tmp.setUserId(user.getUserId());
        return tmp;
    }

    @RequestMapping(value = "getUserName", method = RequestMethod.GET)
    public @ResponseBody
    User getUserName(String userId) {
        User user = new User();
        if (user == null || userId == null) {
            return user;
        } else {
            user = userServiceI.findUserById(Integer.parseInt(userId));
            User res = new User();
            res.setUserName(user.getUserName());
            return res;
        }
    }

    @RequestMapping(value = "/setUserInformation", method = RequestMethod.POST)
    @ResponseBody
    public DefaultClass setUserInformation(String userId, String userName, String userSex, String userTrueName, String userSign, String userDisc, String userPhone, String userQQ, String userEmail) {

//        对比UserId和userName查看数据来源是否为同一人
        User user = userServiceI.findUserById(Integer.parseInt(userId));
        if (user.getUserName().equals(userName)) {
            //UserId 和 UserName 匹配
//            填写基本信息
            user.setUserSex(userSex);
            user.setUserSign(userSign);
            user.setUserDisc(userDisc);
            user.setUserTrueName(userTrueName);

            //获取Connection并删除，若没有，则跳过
            Connection connection = userServiceI.findConnectionByUser(user);
            if (connection != null) {
                userServiceI.deleteConnectionByUser(user);
            }
            connection = new Connection();
            connection.setEmail(userEmail);
            connection.setPhoneNumber(userPhone);
            connection.setQqNumber(userQQ);
            connection.setUserId(user.getUserId());

            //通知Dao 修改数据
            userServiceI.createConnection(connection);
            userServiceI.updateUserInformation(user);
        }

        return new DefaultClass();
    }
}
