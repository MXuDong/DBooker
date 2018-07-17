package dong.dao;

import dong.model.Bookers;

import java.awt.print.Book;
import java.util.List;

public interface BookersMapper {

    List<Bookers> findAll();

    int deleteByPrimaryKey(Integer bookerId);

    int insert(Bookers record);

    int insertSelective(Bookers record);

    Bookers selectByPrimaryKey(Integer bookerId);

    int updateByPrimaryKeySelective(Bookers record);

    int updateByPrimaryKeyWithBLOBs(Bookers record);

    int updateByPrimaryKey(Bookers record);
}