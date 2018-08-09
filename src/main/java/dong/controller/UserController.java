package dong.controller;

import dong.model.User;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public ModelAndView defaultUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody User login(String userName, String password){
        User user = new User();
        if(userServiceI.userCanLoginIn(userName, password)){
            User res = userServiceI.findUserByUserName(userName);
            HttpSession session = request.getSession();
            session.setAttribute("userId", res.getUserId());
            user.setUserId(res.getUserId());
        }

        return user;
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public @ResponseBody User register(String userName, String password){
        User user = userServiceI.findUserByUserName(userName);
        if(user == null){
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
    public User getUserName(int userId){
        User user = userServiceI.findUserById(userId);
        User res = new User();
        res.setUserName(user.getUserName());
        return res;
    }
}
