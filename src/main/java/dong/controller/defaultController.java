package dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("")
public class defaultController {

    @RequestMapping(value = {"", "index"})
    public ModelAndView turnToIndexJsp(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "login")
    public ModelAndView turnToLoginJsp(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Login");
        return modelAndView;
    }

    @RequestMapping(value = "register")
    public ModelAndView turnToRegisterJsp(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Register");
        return modelAndView;
    }

    @RequestMapping(value = "about")
    public ModelAndView turnAbout(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("About");
        return modelAndView;
    }

    @RequestMapping(value = "bookerInfo")
    public ModelAndView turnBookerInfo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("BookerInfo");
        return modelAndView;
    }

    @RequestMapping(value = "personInfo")
    public ModelAndView turnPersonInfo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("personInfo");
        return modelAndView;
    }
}
