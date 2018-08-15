package dong.controller;

import dong.model.Bookers;
import dong.model.DefaultClass;
import dong.service.Interface.BookerService;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/booker")
public class BookerController {

    @Autowired
    BookerService bookerService;
    @Autowired
    UserServiceI userServiceI;

    @RequestMapping(value = "getUserBookerCount", method = RequestMethod.GET)
    @ResponseBody
    public DefaultClass getUserBookerCount(String userId) {
        int res = bookerService.getBookerCount(Integer.parseInt(userId));
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.setResInt(res);
        return defaultClass;
    }

    @RequestMapping(value = "getUserBookers", method = RequestMethod.GET)
    @ResponseBody
    //getStatus : 获取全部还是部份， <0 为全部，>0 为获取部份
    //返回的数据只包含 标题 、 作者 、 BookerID
    public List<Bookers> getUserBookers(String getStatus, String UserId) {
        int status = Integer.parseInt(getStatus);
        int userId = Integer.parseInt(UserId);
        List<Bookers> res = new ArrayList<Bookers>();
        List<Bookers> tmp = bookerService.findBookersByUserId(userId);
        Iterator<Bookers> iterator = tmp.iterator();
        while (iterator.hasNext() && status != 0) {
            Bookers bookers = iterator.next();
            Bookers newBooker = new Bookers();
            newBooker.setUserId(bookers.getUserId());
            newBooker.setBookerHead(bookers.getBookerHead());
            res.add(newBooker);
            status--;
        }
        return res;
    }

    @RequestMapping(value = "getMainBookers", method = RequestMethod.GET)
    @ResponseBody
    public List<Bookers> getIndexMainBooker(String flagId){
        int status = Integer.parseInt(flagId);
        List<Bookers> res = new ArrayList<Bookers>();
        List<Bookers> tmp = bookerService.findAll();
        Iterator<Bookers> iterator = tmp.iterator();
        int flag = 0;
        int size = 0;
        while(iterator.hasNext()){
            if(flag < status) continue;
            if(size >= 10) break;
            Bookers bookers = iterator.next();
            bookers.setBookerInfo(userServiceI.findUserById(bookers.getUserId()).getUserName());
            res.add(bookers);
            size++;
        }

        return res;
    }
}
