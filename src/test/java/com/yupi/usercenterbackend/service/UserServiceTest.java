package com.yupi.usercenterbackend.service;

import com.yupi.usercenterbackend.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 用户服务测试
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("jason");
        user.setUserAccount("123");
        user.setAvatarUrl("jjjj");
        user.setGender(0);
        user.setUserPassword("1234");
        user.setPhone("1321");
        user.setEmail("1341");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

}