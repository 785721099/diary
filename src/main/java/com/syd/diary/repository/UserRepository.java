package com.syd.diary.repository;

import com.syd.diary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sunyaodong
 * @description
 * @email 15091776297@163.com
 * @created 2019/5/24 上午10:50
 */
public interface UserRepository  extends JpaRepository<User,Long> {
}
