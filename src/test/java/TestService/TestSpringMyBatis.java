package TestService;

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
    public void TestUserServiceImpl(){
        System.out.println(serviceI.userCanLoginIn("mxd", "233333"));
    }
}
