package dong.service.Impl;

import dong.dao.BookersMapper;
import dong.dao.UserMapper;
import dong.model.Bookers;
import dong.model.User;
import dong.service.Interface.BookerService;
import org.springframework.stereotype.Service;

@Service("bookerService")
public class BookerServiceImpl implements BookerService {
    private BookersMapper bookersMapper;
    private UserMapper userMapper;

    @Override
    public Bookers findBookerById(int bookerId) {
        return bookersMapper.selectByPrimaryKey(bookerId);
    }

    @Override
    public boolean createBooker(Bookers bookers) {
        int res = bookersMapper.insert(bookers);
        return res == 1;
    }

    @Override
    public boolean deleteBooker(int bookerId) {
        int res = bookersMapper.deleteByPrimaryKey(bookerId);
        return res == 1;
    }

    @Override
    public boolean updateBooker(Bookers bookers) {
        int res = bookersMapper.updateByPrimaryKey(bookers);
        return res == 1;
    }

    @Override
    public User findAuthorId(Bookers bookers) {
        return userMapper.selectByPrimaryKey(bookers.getUserId());

    }

    public BookersMapper getBookersMapper() {
        return bookersMapper;
    }

    public void setBookersMapper(BookersMapper bookersMapper) {
        this.bookersMapper = bookersMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
