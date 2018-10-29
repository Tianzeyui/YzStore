package cn.ssm.controller;

import cn.ssm.pojo.User;
import cn.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService us;

    public UserService getUs() {
        return us;
    }

    public void setUs(UserService us) {
        this.us = us;
    }

    @RequestMapping("/getUserJSON")
    @ResponseBody
    public String getUserJSON() {
        return us.getAllUser();
    }

    @ResponseBody
    @RequestMapping("/sendUserJSON")
    public String sendUserJSON(@RequestBody User u) {
        System.out.println(u.getUname() + u.getUinfo());
        return "太长了";
    }

    /**
     *
     * @param ulist 用户集合（用户列表JSON）
     * @return "success" 说明提交成功 "faild" 说明提交失败
     */
    @ResponseBody
    @RequestMapping("/sendUserListJSON")
    public String sendUserListJSON(@RequestBody List<User> ulist) {
        for (User u : ulist) {
            System.out.println(u.getUname()+u.getUage());
        }
        return "success";
    }
}
