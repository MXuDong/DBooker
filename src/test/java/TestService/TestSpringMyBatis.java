package TestService;

import dong.model.User;
import dong.service.Interface.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringMyBatis {

    private ApplicationContext ac;
    private UserServiceI serviceI;

    @Before
    public void prefer(){
        ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        serviceI = (UserServiceI) ac.getBean("userService");
    }

    @Test
    public void UserLogin(){
        System.out.println(serviceI.userCanLoginIn("mxd", "233333"));
    }

    public void TestRegister(){
        User user = new User();
        user.setUserName("weimingqi");
        user.setUserPassword("213");
        user.setUserSex("M");
    }
}
