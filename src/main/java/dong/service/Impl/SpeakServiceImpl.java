package dong.service.Impl;

import dong.dao.SpeakBookerMapper;
import dong.dao.UserMapper;
import dong.model.SpeakBooker;
import dong.model.User;
import dong.service.Interface.SpeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakService")
public class SpeakServiceImpl implements SpeakService {

    private SpeakBookerMapper speakBookerMapper;
    private UserMapper userMapper;

    public SpeakBookerMapper getSpeakBookerMapper() {
        return speakBookerMapper;
    }

    @Autowired
    public void setSpeakBookerMapper(SpeakBookerMapper speakBookerMapper) {
        this.speakBookerMapper = speakBookerMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

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
    public User findUserBySpeak(int speakBookerId) {
        return userMapper.selectByPrimaryKey(findById(speakBookerId).getUserId());
    }

    @Override
    public SpeakBooker findById(int SpeakBookerId) {
        SpeakBooker speakBooker = speakBookerMapper.selectByPrimaryKey(SpeakBookerId);
        return speakBooker;
    }
}
