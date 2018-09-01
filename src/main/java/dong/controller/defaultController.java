package dong.controller;

import dong.model.*;
import dong.service.Interface.BookerService;
import dong.service.Interface.CareService;
import dong.service.Interface.FollowService;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class defaultController {

    @Autowired
    UserServiceI userServiceI;
    @Autowired
    BookerService bookerService;
    @Autowired
    CareService careService;
    @Autowired
    FollowService followService;

//    首页
    @RequestMapping(value = {"", "index"})
    public ModelAndView turnToIndexJsp(){
        String MAVName = "index";
        return getModelAndView(MAVName);
    }

//    登陆页面
    @RequestMapping(value = "login")
    public ModelAndView turnToLoginJsp(){
        String MAVName = "Login";
        return getModelAndView(MAVName);
    }

//    注册页面
    @RequestMapping(value = "register")
    public ModelAndView turnToRegisterJsp(){
        String MAVName = "Register";
        return getModelAndView(MAVName);
    }

//    关于页面
    @RequestMapping(value = "about")
    public ModelAndView turnAbout(){
        String MAVName = "About";
        return getModelAndView(MAVName);
    }

    @RequestMapping(value = "/newBooker")
    public ModelAndView turnNewBooker(){
        String MAVName = "NewBooker";
        return getModelAndView(MAVName);
    }

//    博客信息详情页
    @RequestMapping(value = "bookerInfo")
    public ModelAndView turnBookerInfo(){
        String MAVName = "BookerInfo";
        return getModelAndView(MAVName);
    }

    //用户信息详情页
    @RequestMapping(value = "personInfor")
    public ModelAndView turnPersonInfo(String userName){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("PersonInfor");

        //获取用户信息
        User user = userServiceI.findUserByUserName(userName);
        modelAndView.addObject("userName",user.getUserName());
        modelAndView.addObject("userSex",user.getUserSex());
        modelAndView.addObject("userTrueName",user.getUserTrueName());
        modelAndView.addObject("userSign",user.getUserSign());
        modelAndView.addObject("userDisc",user.getUserDisc());
//        获取联系方式
        Connection connection = userServiceI.findConnectionByUser(user);
        String userQQ;
        String userPhone;
        String userEmail;
        if(connection == null){
            userQQ = "用户没有填写联系方式";
            userPhone = "用户没有填写联系方式";
            userEmail = "用户没有填写联系方式";
        }else{
            userPhone = connection.getPhoneNumber();
            userQQ = connection.getQqNumber();
            userEmail = connection.getEmail();
        }
        modelAndView.addObject("userPhone", userPhone);
        modelAndView.addObject("userQQ", userQQ);
        modelAndView.addObject("userEmail", userEmail);

//        获取bookers
        List<Bookers> bookers = bookerService.findBookersByUserId(user.getUserId());

        modelAndView.addObject("bookersList", bookers);
        return modelAndView;
    }

//    跳转到用户详情页
    @RequestMapping("userInfor")
    public ModelAndView turnUserInfo(String userId){
        ModelAndView modelAndView = getModelAndView("UserInfor");

        User user = userServiceI.findUserById(Integer.parseInt(userId));
        modelAndView.addObject("userName",user.getUserName());
        modelAndView.addObject("userSex",user.getUserSex());
        modelAndView.addObject("userTrueName",user.getUserTrueName());
        modelAndView.addObject("userSign",user.getUserSign());
        modelAndView.addObject("userDisc",user.getUserDisc());
//        获取联系方式
        Connection connection = userServiceI.findConnectionByUser(user);
        String userQQ;
        String userPhone;
        String userEmail;
        if(connection == null){
            userQQ = "";
            userPhone = "";
            userEmail = "";
        }else{
            userPhone = connection.getPhoneNumber();
            userQQ = connection.getQqNumber();
            userEmail = connection.getEmail();
        }
        modelAndView.addObject("userPhone", userPhone);
        modelAndView.addObject("userQQ", userQQ);
        modelAndView.addObject("userEmail", userEmail);

//        获取bookers
        List<Bookers> bookers = bookerService.findBookersByUserId(user.getUserId());

        modelAndView.addObject("bookersList", bookers);

        return modelAndView;
    }

    @RequestMapping(value = "/userCare")
    public ModelAndView myCareBooker(String userId){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("UserCare");

        List<Care> cares = careService.findAllCaresByUserId(Integer.parseInt(userId));
        List<Bookers> bookers = new ArrayList<Bookers>();
        for(Care c : cares){
            Bookers booker = bookerService.findBookerById(c.getBookerId());
            bookers.add(booker);
        }

        modelAndView.addObject("bookersList", bookers);

        User user = userServiceI.findUserById(Integer.parseInt(userId));
        modelAndView.addObject("userName", user.getUserName());

        return modelAndView;
    }

    @RequestMapping(value = "/userFollow")
    public ModelAndView turnUserFollow(String userId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("UserFollow");

        List<Follow> follows = followService.findAllByFollowUser(Integer.parseInt(userId));
        List<User> users = new ArrayList<User>();

        for(Follow f : follows){
            User user = userServiceI.findUserById(f.getBeFollowUserId());
            users.add(user);
        }

        modelAndView.addObject("userList", users);

        return modelAndView;
    }

//    MAV 生成工具
    public ModelAndView getModelAndView(String MAVName){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(MAVName);
        return modelAndView;
    }
}
