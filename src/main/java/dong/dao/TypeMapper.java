package dong.dao;

import dong.model.Type;

import java.util.List;

public interface TypeMapper {

    List<Type> findAll();

    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}