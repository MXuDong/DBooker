package dong.dao;

import dong.model.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}