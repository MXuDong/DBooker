package dong.dao;

import dong.model.SpeakBooker;

public interface SpeakBookerMapper {
    int deleteByPrimaryKey(Integer speakId);

    int insert(SpeakBooker record);

    int insertSelective(SpeakBooker record);

    SpeakBooker selectByPrimaryKey(Integer speakId);

    int updateByPrimaryKeySelective(SpeakBooker record);

    int updateByPrimaryKey(SpeakBooker record);
}