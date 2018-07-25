package TestService;

import dong.model.Follow;
import dong.model.User;
import dong.service.Interface.FollowService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestFollowService {
    private ApplicationContext ac;
    private FollowService fs;

    @Before
    public void Before(){
        ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        fs = (FollowService) ac.getBean("followService");
    }

    @Test
    public void TestCreateFollow(){
        Follow follow = new Follow();
        follow.setUserId(3);
        follow.setBeFollowUserId(2);
        System.out.println(fs.createFollow(follow));
    }

    @Test
    public void TestDeleteFollow(){
        System.out.println(fs.deleteFollow(2));
    }

    @Test
    public void TestFindFollowUser(){
        User user = fs.findFollowUser(2);
        System.out.println(user);
    }

    @Test
    public void TestFindFollowedUser(){
        User user = fs.findFollowedUser(2);
        System.out.println(user);
    }

    @Test
    public void TestFindAllByFollowUser(){
        List<Follow> follows = fs.findAllByFollowUser(3);
        for(Follow f : follows){
            System.out.println(f);
        }
    }

    @Test
    public void TestFindAllByBeFollowedUser(){
        List<Follow> follows = fs.findAllByBeFollowedUser(2);
        for(Follow f : follows){
            System.out.println(f);
        }
    }
}
