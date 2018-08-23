package dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("")
public class defaultController {

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

//    博客信息详情页
    @RequestMapping(value = "bookerInfo")
    public ModelAndView turnBookerInfo(){
        String MAVName = "BookerInfo";
        return getModelAndView(MAVName);
    }

    //用户信息详情页
    @RequestMapping(value = "personInfo")
    public ModelAndView turnPersonInfo(){
        String MAVName = "PersonInfor";
        return getModelAndView(MAVName);
    }

//    MAV 生成工具
    public ModelAndView getModelAndView(String MAVName){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(MAVName);
        return modelAndView;
    }
}
