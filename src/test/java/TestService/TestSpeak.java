package TestService;

import dong.model.SpeakBooker;
import dong.model.User;
import dong.service.Interface.SpeakService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestSpeak {
    private ApplicationContext ac;
    private SpeakService ss;

    @Before
    public void Before(){
        ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        ss = (SpeakService) ac.getBean("speakService");
    }

    @Test
    public void TestCreateSpeak(){
        SpeakBooker speakBooker = new SpeakBooker();
        speakBooker.setBookerId(4);
        speakBooker.setUserId(2);
        speakBooker.setSpeakTime(new Date());
        speakBooker.setSpeakInfo("SSM = Spring MVC + Spring + MyBatis");
        System.out.println(ss.createSpeak(speakBooker));
    }

    @Test    public void TestDeleteSpeak(){
        System.out.println(ss.deleteSpeak(3));
    }

    @Test
    public void TestUpdataSpeakBooker(){
        SpeakBooker speakBooker = new SpeakBooker();
        speakBooker.setBookerId(4);
        speakBooker.setUserId(2);
        speakBooker.setSpeakTime(new Date());
        speakBooker.setSpeakId(3);
        speakBooker.setSpeakInfo("SSM = Spring MVC + Spring + MyBatis, Updata Complete");
        System.out.println(ss.updateSpeakBooker(speakBooker));
    }

    @Test
    public void TestFindAllByBookerId(){
        List<SpeakBooker> speakBookers = ss.findAllByBookerId(4);
        for(SpeakBooker s : speakBookers){
            System.out.println(s);
        }
    }

    @Test
    public void TestFindUserBySpeak(){
        User user = ss.findUserBySpeak(3);
        System.out.println(user);
    }
}
