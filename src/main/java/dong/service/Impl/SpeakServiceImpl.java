package dong.service.Impl;

import dong.dao.SpeakBookerMapper;
import dong.dao.UserMapper;
import dong.model.SpeakBooker;
import dong.model.User;
import dong.service.Interface.SpeakService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakService")
public class SpeakServiceImpl implements SpeakService {

    private SpeakBookerMapper speakBookerMapper;
    private UserMapper userMapper;

    @Override
    public boolean createSpeak(SpeakBooker speakBooker) {
        int res = speakBookerMapper.insert(speakBooker);
        return res == 1;
    }

    @Override
    public boolean deleteSpeak(int speakBookerId) {
        int res = speakBookerMapper.deleteByPrimaryKey(speakBookerId);
        return res == 1;
    }

    @Override
    public boolean updateSpeakBooker(SpeakBooker speakBooker) {
        int res = speakBookerMapper.updateByPrimaryKey(speakBooker);
        return res == 1;
    }

    @Override
    public List<SpeakBooker> findAllByBookerId(int bookerId) {
        List<SpeakBooker> res = speakBookerMapper.findAllByBookerId(bookerId);
        return res;
    }

    @Override
    public User findUserBySpeak(SpeakBooker speakBooker) {
        return userMapper.selectByPrimaryKey(speakBooker.getUserId());
    }
}
