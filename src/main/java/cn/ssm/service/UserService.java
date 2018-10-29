package cn.ssm.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /**
     * 获取总用户数
     * @return
     */
    int getCount();

    /**
     * 获取全部用户
     * @return
     */
    String getAllUser();
}
