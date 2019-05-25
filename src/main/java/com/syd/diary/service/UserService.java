package com.syd.diary.service;

import com.syd.diary.entity.User;
import com.syd.diary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author sunyaodong
 * @description
 * @email 15091776297@163.com
 * @created 2019/5/24 上午10:53
 */
@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }
}
