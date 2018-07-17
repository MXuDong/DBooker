package dong.dao;

import dong.model.Care;

import java.util.List;

public interface CareMapper {

    List<Care> findAllByUserId(int userId);

    int deleteByPrimaryKey(Integer careId);

    int insert(Care record);

    int insertSelective(Care record);

    Care selectByPrimaryKey(Integer careId);

    int updateByPrimaryKeySelective(Care record);

    int updateByPrimaryKey(Care record);
}