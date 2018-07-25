package dong.service.Impl;

import dong.dao.BookersMapper;
import dong.dao.CareMapper;
import dong.dao.UserMapper;
import dong.model.Bookers;
import dong.model.Care;
import dong.model.User;
import dong.service.Interface.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("careService")
public class CareServiceImpl implements CareService {

    private CareMapper careMapper;
    private UserMapper userMapper;
    private BookersMapper bookersMapper;

    public CareMapper getCareMapper() {
        return careMapper;
    }

    @Autowired
    public void setCareMapper(CareMapper careMapper) {
        this.careMapper = careMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public BookersMapper getBookersMapper() {
        return bookersMapper;
    }

    @Autowired
    public void setBookersMapper(BookersMapper bookersMapper) {
        this.bookersMapper = bookersMapper;
    }

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
    public User findCareUser(int careId) {
        Care care = findCareById(careId);
        return userMapper.selectByPrimaryKey(care.getUserId());
    }

    @Override
    public Bookers findBeCaredBooker(int careId) {
        Care care = findCareById(careId);
        return bookersMapper.selectByPrimaryKey(care.getBookerId());
    }

    @Override
    public List<Care> findAllCaresByUserId(int UserId) {
        List<Care> res = careMapper.findAllByUserId(UserId);
        return res;
    }

    @Override
    public Care findCareById(int careId) {
        Care care = careMapper.selectByPrimaryKey(careId);
        return care;
    }
}
