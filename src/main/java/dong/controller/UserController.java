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

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceI userServiceI;

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
            user = userServiceI.findUserByUserName(userName);
        }

        return user;
    }
}
