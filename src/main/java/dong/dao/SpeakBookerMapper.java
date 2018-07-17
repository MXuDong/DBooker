package dong.dao;

import dong.model.SpeakBooker;

import java.util.List;

public interface SpeakBookerMapper {

    List<SpeakBooker> findAllByBookerId(int bookerId);

    int deleteByPrimaryKey(Integer speakId);

    int insert(SpeakBooker record);

    int insertSelective(SpeakBooker record);

    SpeakBooker selectByPrimaryKey(Integer speakId);

    int updateByPrimaryKeySelective(SpeakBooker record);

    int updateByPrimaryKey(SpeakBooker record);
}