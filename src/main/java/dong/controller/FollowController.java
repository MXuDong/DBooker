package dong.controller;

import dong.model.DefaultClass;
import dong.model.Follow;
import dong.model.User;
import dong.service.Interface.FollowService;
import dong.service.Interface.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Follow")
public class FollowController {

    @Autowired
    FollowService followService;
    @Autowired
    UserServiceI userServiceI;

//    判断是否有为用户关注了某位用户
    @RequestMapping(value = "/isUserFollowAuthor", method = RequestMethod.GET)
    @ResponseBody
    public DefaultClass isUserFollowAuthor(String userId, String authorName){
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.setResInt(0);
        List<Follow> follows = followService.findAllByFollowUser(Integer.parseInt(userId));
        for(Follow f : follows){
            User author = userServiceI.findUserByUserName(authorName);
            if(author.getUserId() == f.getBeFollowUserId()){
                defaultClass.setResInt(1);
            }
        }

        return defaultClass;
    }

//    添加一位用户的关注
    @RequestMapping(value = "/addFollow", method = RequestMethod.GET)
    @ResponseBody
    public DefaultClass addFollow(String userId, String authorName){
        User author = userServiceI.findUserByUserName(authorName);
        Follow follow = new Follow();
        follow.setUserId(Integer.parseInt(userId));
        follow.setBeFollowUserId(author.getUserId());
        followService.createFollow(follow);
        return new DefaultClass();
    }
//    取消一位用户的关注
    @RequestMapping(value = "/removeFollow", method = RequestMethod.GET)
    @ResponseBody
    public DefaultClass removeFollow(String userId, String authorName){
        List<Follow> follows = followService.findAllByFollowUser(Integer.parseInt(userId));
        User author = userServiceI.findUserByUserName(authorName);
        for(Follow f : follows){
            if(f.getBeFollowUserId() == author.getUserId()){
                followService.deleteFollow(f.getFollowId());
                break;
            }
        }

        return new DefaultClass();
    }


//    获取一位用户的关注列表
}
