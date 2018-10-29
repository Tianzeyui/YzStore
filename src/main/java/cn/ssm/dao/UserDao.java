package cn.ssm.dao;

import cn.ssm.pojo.User;

import java.util.List;

public interface UserDao {

    /**
     * 获取总数
     * @return
     */
    int getTotal();

    /**
     * 获取用户列表
     * @return
     */
    List<User> getAllUser();
}
