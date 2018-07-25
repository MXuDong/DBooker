package dong.service.Interface;

import dong.model.SpeakBooker;
import dong.model.User;

import java.util.List;

public interface SpeakService {
//    添加评论
    boolean createSpeak(SpeakBooker speakBooker);
//    取消评论
    boolean deleteSpeak(int speakBookerId);
//    修改评论
    boolean updateSpeakBooker(SpeakBooker speakBooker);
//    根据Booker查找所有评论
    List<SpeakBooker> findAllByBookerId(int bookerId);
//    查找评论的用户ＩＤ
    User findUserBySpeak(int speakBookerId);
//    根据Speak ID查找Speak
    SpeakBooker findById(int SpeakBookerId);
}
