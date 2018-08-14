package dong.service.Impl;

import dong.dao.BookersMapper;
import dong.dao.CareMapper;
import dong.dao.SpeakBookerMapper;
import dong.dao.UserMapper;
import dong.model.Bookers;
import dong.model.SpeakBooker;
import dong.model.User;
import dong.service.Interface.BookerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("bookerService")
public class BookerServiceImpl implements BookerService {
    private BookersMapper bookersMapper;
    private UserMapper userMapper;
    private SpeakBookerMapper speakBookerMapper;
    private CareMapper careMapper;

    public SpeakBookerMapper getSpeakBookerMapper() {
        return speakBookerMapper;
    }

    @Autowired
    public void setSpeakBookerMapper(SpeakBookerMapper speakBookerMapper) {
        this.speakBookerMapper = speakBookerMapper;
    }

    public CareMapper getCareMapper() {
        return careMapper;
    }

    @Autowired
    public void setCareMapper(CareMapper careMapper) {
        this.careMapper = careMapper;
    }

    @Override
    public Bookers findBookerById(int bookerId) {
        return bookersMapper.selectByPrimaryKey(bookerId);
    }

    @Override
    public boolean createBooker(Bookers bookers) {
        List<Bookers> temp = findBookersByUserId(bookers.getUserId());
        Iterator<Bookers> iterator = temp.iterator();
        while(iterator.hasNext()){
            Bookers bookers1 = iterator.next();
            if(bookers1.getBookerHead().equals(bookers.getBookerHead())){
                return false;
            }
        }
        int res = bookersMapper.insert(bookers);
        return res == 1;
    }

    @Override
    public boolean deleteBooker(int bookerId) {
        careMapper.deleteByBookerId(bookerId);
        speakBookerMapper.deleteByPrimaryKey(bookerId);
        int res = bookersMapper.deleteByPrimaryKey(bookerId);
        return res == 1;
    }

    @Override
    public boolean updateBooker(Bookers bookers) {
        int res = bookersMapper.updateByPrimaryKey(bookers);
        return res == 1;
    }

    @Override
    public User findAuthor(int bookersId) {
        return userMapper.selectByPrimaryKey(bookersId);

    }

    public BookersMapper getBookersMapper() {
        return bookersMapper;
    }

    @Autowired
    public void setBookersMapper(BookersMapper bookersMapper) {
        this.bookersMapper = bookersMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<Bookers> findBookersByUserId(int userId) {
        List<Bookers> tmp = bookersMapper.findAll();
        List<Bookers> res = new ArrayList<Bookers>();

        Iterator<Bookers> iterator = tmp.iterator();

        while(iterator.hasNext()){
            Bookers b = iterator.next();
            if(b.getUserId() == userId){
                res.add(b);
            }
        }

        return res;
    }

    @Override
    public int getBookerCount(int userId) {
       List<Bookers> bookers = findBookersByUserId(userId);
       return bookers.size();
    }

    @Override
    public List<Bookers> findAll() {
        List<Bookers> res = bookersMapper.findAll();
        return res;
    }
}
