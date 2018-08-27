package dong.controller;

import dong.model.DefaultClass;
import dong.model.Follow;
import dong.service.Interface.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Follow")
public class FollowController {

    @Autowired
    FollowService followService;

//    判断是否有为用户关注了某位用户
    @RequestMapping("/isUserFollowAuthor")
    @ResponseBody
    public DefaultClass isUserFollowAuthor(String userId, String authorId){
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.setResInt(0);
        List<Follow> follows = followService.findAllByFollowUser(Integer.parseInt(userId));
        for(Follow f : follows){
            if(f.getBeFollowUserId().equals(authorId)){
                defaultClass.setResInt(1);
                break;
            }
        }

        return defaultClass;
    }

//    添加一位用户的关注

//    取消一位用户的关注

//    获取一位用户的关注列表
}
