package dong.controller;


import dong.model.Bookers;
import dong.model.Care;
import dong.model.DefaultClass;
import dong.service.Interface.BookerService;
import dong.service.Interface.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Care")
public class CareController {

    @Autowired
    CareService careService;
    @Autowired
    BookerService bookerService;

    @RequestMapping(value = "/isUserCareBooker")
    @ResponseBody
    public DefaultClass isUserCareBooker(String bookerHeader, String userId){
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.setResInt(0);
        List<Care> list = careService.findAllCaresByUserId(Integer.parseInt(userId));

        for(Care c : list){
            Bookers bookers = bookerService.findBookerById(c.getBookerId());
            if(bookers.getBookerHead().equals(bookerHeader)){
                defaultClass.setResInt(1);
                break;
            }
        }

        return defaultClass;
    }

    @RequestMapping("addCare")
    public void addCare(String userId, String bookerId){
        Care care = new Care();
        care.setCareTime(new Date());
        care.setUserId(Integer.parseInt(userId));
        care.setBookerId(Integer.parseInt(bookerId));
        careService.createCare(care);
    }

    public void deleteCare(){

    }
}
