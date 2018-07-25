package dong.service.Interface;

import dong.model.Bookers;
import dong.model.Care;
import dong.model.User;

import java.util.List;

public interface CareService {
//    添加收藏
    boolean createCare(Care care);
//    取消收藏
    boolean deleteCare(int careId);
//    查看关注人
    User findCareUser(int careId);
//    查看被关注博客
    Bookers findBeCaredBooker(int careId);
//    查找某位用户的收藏
    List<Care> findAllCaresByUserId(int UserId);
    Care findCareById(int careId);
}
