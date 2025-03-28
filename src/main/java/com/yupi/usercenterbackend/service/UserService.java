package com.yupi.usercenterbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenterbackend.model.User;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author lenovo
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-03-25 19:12:06
 */

/**
 * 用户服务
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param PlanetCode 星球编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String PlanetCode);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

}
