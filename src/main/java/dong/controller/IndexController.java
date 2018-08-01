package dong.controller;

import dong.model.User;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class IndexController {

    private UserServiceI userServiceI;

    @RequestMapping(value = {"", "index", "index.jsp"})
    public ModelAndView listCategory(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("index/{id}")
    public @ResponseBody User getUser(@PathVariable("id")Integer id){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        userServiceI = (UserServiceI) ac.getBean("userService");
        User user = userServiceI.findUserById(id);
        System.out.println(user);
        return user;
    }
}
