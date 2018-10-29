package cn.ssm.service.impl;

import cn.ssm.dao.UserDao;
import cn.ssm.pojo.User;
import cn.ssm.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao ud;

    public UserDao getUd() {
        return ud;
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }


    public int getCount() {
        int total = ud.getTotal();
        return total;
    }

    public String getAllUser() {
        List<User> ulist = ud.getAllUser();
        String s = JSON.toJSONString(ulist);
        return s;
    }
}
