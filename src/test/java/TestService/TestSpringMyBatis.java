package TestService;

import dong.model.Care;
import dong.model.User;
import dong.service.Interface.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpringMyBatis {

    private ApplicationContext ac;
    private UserServiceI serviceI;

    @Before
    public void prefer(){
        ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        serviceI = (UserServiceI) ac.getBean("userService");
    }

    @Test
    public void TestGetUserByUserName(){
        User u = serviceI.findUserByUserName("mxd");
        System.out.println(u);
    }

    @Test
    public void TestFindUserById(){
        User u = serviceI.findUserById(1);
        System.out.println(u);
    }

    @Test
    public void UserLogin(){
        System.out.println(serviceI.userCanLoginIn("mxd", "233333"));
    }

    @Test
    public void TestRegister(){
        User user = new User();
        user.setUserName("weimingqi");
        user.setUserPassword("213");
        user.setUserSex("M");
        user.setUserTrueName("为名气");
        user.setUserSign("23423423");
        System.out.println(serviceI.registerUser(user));
    }
}