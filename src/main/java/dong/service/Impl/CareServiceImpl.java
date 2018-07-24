package dong.service.Impl;

import dong.dao.BookersMapper;
import dong.dao.CareMapper;
import dong.dao.UserMapper;
import dong.model.Bookers;
import dong.model.Care;
import dong.model.User;
import dong.service.Interface.CareService;
import org.springframework.stereotype.Service;

@Service("careService")
public class CareServiceImpl implements CareService {

    private CareMapper careMapper;
    private UserMapper userMapper;
    private BookersMapper bookersMapper;

    @Override
    public boolean createCare(Care care) {
        int res = careMapper.insert(care);
        return res == 1;
    }

    @Override
    public boolean deleteCare(int careId) {
        int res = careMapper.deleteByPrimaryKey(careId);
        return res == 1;
    }

    @Override
    public User getCareUser(Care care) {
        return userMapper.selectByPrimaryKey(care.getUserId());
    }

    @Override
    public Bookers getBeCaredBooker(Care care) {
        return bookersMapper.selectByPrimaryKey(care.getBookerId());
    }

    public CareMapper getCareMapper() {
        return careMapper;
    }

    public void setCareMapper(CareMapper careMapper) {
        this.careMapper = careMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public BookersMapper getBookersMapper() {
        return bookersMapper;
    }

    public void setBookersMapper(BookersMapper bookersMapper) {
        this.bookersMapper = bookersMapper;
    }
}
