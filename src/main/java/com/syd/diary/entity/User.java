package com.syd.diary.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

/**
 * @author sunyaodong
 * @description
 * @email 15091776297@163.com
 * @created 2019/5/24 上午10:42
 */
@Entity(name="user")
public class User {
            @Id
            @GeneratedValue(strategy= GenerationType.IDENTITY)
            @Column(name = "id", length = 32)
            private Long id;
            @Column(length = 50)
            private String name;
            @Column(length = 3)
            private Integer age;
            @Column(length = 32)
            private String loginName;
            @Column(length = 32)
            private String password;
            @Column(length = 32)
            private String salt2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt2() {
        return salt2;
    }

    public void setSalt2(String salt2) {
        this.salt2 = salt2;
    }
}
