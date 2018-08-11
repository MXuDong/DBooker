package dong.controller;

import dong.model.DefaultClass;
import dong.service.Interface.BookerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/booker")
public class BookerController {

    @Autowired
    BookerService bookerService;

    @RequestMapping(value = "getUserBookerCount", method = RequestMethod.GET)
    @ResponseBody
    public DefaultClass getUserBookerCount(String userId){
        int res = bookerService.getBookerCount(Integer.parseInt(userId));
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.setResInt(res);
        return defaultClass;
    }
}
