package dong.dao;

import dong.model.Care;

import java.util.List;

public interface CareMapper {

    List<Integer> findAllByUserId(int userId);

    int deleteByPrimaryKey(Integer careId);

    int insert(Care record);

    Care selectByPrimaryKey(Integer careId);

    int updateByPrimaryKey(Care record);
}