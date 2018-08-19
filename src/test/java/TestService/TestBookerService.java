package TestService;

import dong.model.Bookers;
import dong.model.User;
import dong.service.Interface.BookerService;
import dong.service.Interface.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestBookerService {
    private ApplicationContext ac;
    private BookerService bs;

    @Before
    public void Before(){
        ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        bs = (BookerService) ac.getBean("bookerService");
    }

    @Test
    public void TestCreateBooker(){
        Bookers b = new Bookers();
        b.setBookerHead("这个Booker用来测试我的显示系统是否正常");
        b.setBookerInfo("<h1>Test One </h1><br/><ul><li>Author:Dong</li><li>Time : 2018-8-15</li></ul>");
        b.setUserId(12);
        b.setCreateTime(new Date());
        System.out.println(bs.createBooker(b));
    }

    @Test
    public void TestDeleteBooker(){
        System.out.println(bs.deleteBooker(6));
    }

    @Test
    public void TestUpdataBooker(){
        Bookers b = new Bookers();
        b.setBookerId(2);
        b.setBookerHead("标题");
        b.setBookerInfo("测试博客系统,Updata");
        b.setUserId(2);
        b.setCreateTime(new Date());
        System.out.println(bs.updateBooker(b));

    }

    @Test
    public void TestfindAuthor(){
        User user = bs.findAuthor(2);
        System.out.println(user);
    }

    @Test
    public void TestfindBookerById(){
        Bookers b = bs.findBookerById(2);
        System.out.println(b);
    }

    @Test
    public void TestFindByUserId(){
        List<Bookers> res = bs.findBookersByUserId(2);
        for(Bookers B : res){
            System.out.println(B);
        }
    }
}
