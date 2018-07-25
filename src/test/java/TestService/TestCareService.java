package TestService;

import dong.model.Bookers;
import dong.model.Care;
import dong.model.User;
import dong.service.Interface.CareService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestCareService {
    private ApplicationContext ac;
    private CareService cs;

    @Before
    public void Before(){
        ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        cs = (CareService) ac.getBean("careService");
    }

    @Test
    public void TestCreateCare(){
        Care care = new Care();
        care.setUserId(3);
        care.setBookerId(4);
        care.setCareTime(new Date());
        System.out.println(cs.createCare(care));
    }

    @Test
    public void TestDeleteCare(){
        System.out.println(cs.deleteCare(2));
    }

    @Test
    public void TestGetCareUser(){
        User user = cs.findCareUser(2);
        System.out.println(user);
    }

    @Test
    public void TestGetBeCareBooker(){
        Bookers b = cs.findBeCaredBooker(2);
        System.out.println(b);
    }

    @Test
    public void TestGetAllCareByUser(){
        List<Care> cares = cs.findAllCaresByUserId(3);
        for(Care c : cares){
            System.out.println(c);
        }
    }
}
