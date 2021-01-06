package com.itmuch.contentcenter;

import com.itmuch.contentcenter.dao.content.UserMapper;
import com.itmuch.contentcenter.domain.entity.content.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author localhost
 */
@RestController
public class TestController {
    @Resource
    private UserMapper userMapper;
    @GetMapping("/insert")
    public User insertTest(){
        User user = new User();
        user.setName("xxx");
        user.setBase64("64");
        user.setBytes(1);
        this.userMapper.insertSelective(user);
        return user;
    }
}
