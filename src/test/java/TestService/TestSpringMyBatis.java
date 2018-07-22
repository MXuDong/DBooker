package TestService;

import dong.service.UserServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringMyBatis {

    @Test
    public void TestUserServiceImpl(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        UserServiceI serviceI = (UserServiceI) ac.getBean("userService");
        System.out.println(serviceI.userCanLoginIn("mxd", "233333"));
    }
}
