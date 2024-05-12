# DemoJavaEE-Project项目

> 这个项目是大三下学期的时候,为了完成JavaEE大作业而写的,我具体的话是采用了HTML+CSS+JavaScript作为前端页面开发,Springboot+Mybatis作为后端逻辑处理,MySQL作为数据库存储,实现数据的持久化.
>
> **在项目构建初期,我打算尽量将学过的东西用上**,但是我承认个人能力有限,我尽量每一步做到最好,无论未来如何,我选择希望.

## 2024-05-11 new 一个仓库😊🎉

*已经实现的是注册页面*,但是**安全性可能还没完善**

> SigninPages.html页面

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>不要等待就现在,加入我的世界</title>
    <link rel="stylesheet" href="./css/base.css">
    <link rel="stylesheet" href="./css/SigninPages.css">
</head>
<body>
    <div class="main">

        <!-- 主要的main区域 -->
        <div class="container">
            <div class="form_area">
                <p class="title">SIGN UP</p>
                <form action="/register" method="post">
                    <div class="form_group">
                        <label class="sub_title" for="username">UserName</label>
                        <input placeholder="请输入用户名哦" class="form_style" type="text" id="username" name="username">
                    </div>
                    <div class="form_group">
                        <label class="sub_title" for="email">RecoverEmail</label>
                        <input placeholder="这是找回你用户名的唯一方式" id="email" class="form_style" type="email" name="email">
                    </div>
                    <div class="form_group">
                        <label class="sub_title" for="password">Password</label>
                        <input placeholder="这是只有你知道的密码哦" id="password" class="form_style" type="password" name="password">
                    </div>
                    <div>
                        <button class="btn">注册</button>
                        <p>你已经在我的世界里了? <a class="link" href="./LoginPages.html">点击我登录</a></p><a class="link" href="">
                    </a>
                    </div><a class="link" href=""></a>
                </form>

            </div><a class="link" href="">
            </a>
        </div>

        <!-- 底部标识 -->
        <div class="footer">
            <p class="copyright">
                Copyright© 2024 SouthAki. All Rights Reserved.
            </p>
        </div>
    </div>
</body>
</html>
```

🚧:具体的话还有些变化,但是初版结构是这样的

然后是关键的后端部分

> Controller软件包
>
> **RegistrationController.java**

```java
package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Service.UserService; // 导入UserService类
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RegistrationController {
    private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @PostMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password) {
        // 记录接收到的表单数据
        logger.info("Received username: " + username);
        logger.info("Received email: " + email);
        logger.info("Received password: " + password);

        // 创建User对象并设置属性
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        try {
            // 将用户保存到数据库
            userService.registerUser(user);
            // 返回成功消息
            return "Registration successful";
        } catch (Exception e) {
            // 记录异常信息
            logger.error("Error occurred during user registration", e);
            // 返回错误消息
            return "Registration failed. Please try again later.";
        }
    }
}
```

> Model软件包
>
> **User.java**

```java
package org.example.demojavaeeproject.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;

    // 构造方法
    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // getter和setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
```

> Service软件包
>
> **UserService.java**

```java
package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }
}
```

> SQL语句
> 
> **部分**

```sql
create database demospringboot;
use demospringboot;
drop table if exists `user`;

-- 用户表 
CREATE TABLE user (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(50) NOT NULL,
                      email VARCHAR(100) NOT NULL,
                      password VARCHAR(100) NOT NULL
);
select * from user;

-- 学生信息表
drop table if exists `stuInfo`;
create table stuInfo(
                        id int auto_increment primary key,
                        username varchar(50) not null,
                        stuname varchar(50) not null,
                        stuid varchar(100) not null,
                        grade varchar(10) not null,
                        class varchar(50) not null
);
insert into `stuinfo` values(1,'xieleihan','xieleihan','1001','大二','1班');
select * from stuinfo;
```
关键部分就是上面那些,后续肯定有修改
