package dong.dao;

import dong.model.Care;

public interface CareMapper {
    int deleteByPrimaryKey(Integer careId);

    int insert(Care record);

    int insertSelective(Care record);

    Care selectByPrimaryKey(Integer careId);

    int updateByPrimaryKeySelective(Care record);

    int updateByPrimaryKey(Care record);
}