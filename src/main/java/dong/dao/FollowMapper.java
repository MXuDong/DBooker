package dong.dao;

import dong.model.Follow;

import java.util.List;

public interface FollowMapper {

    List<Follow> findAllByUserId(int userId);

    int deleteByPrimaryKey(Integer followId);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer followId);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}