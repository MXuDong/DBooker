package dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
