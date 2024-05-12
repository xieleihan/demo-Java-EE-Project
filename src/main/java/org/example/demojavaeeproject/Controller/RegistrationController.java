package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Service.UserService; // 导入UserService类
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class RegistrationController {
    private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "*")
    @PostMapping("/register")
    public RedirectView register(@RequestParam("username") String username,
                                 @RequestParam("email") String email,
                                 @RequestParam("password") String password,
                                 RedirectAttributes redirectAttributes) {
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
            return new RedirectView("/loginPages.html");
        } catch (Exception e) {
            // 记录异常信息
            logger.error("Error occurred during user registration", e);
            // 在重定向中添加失败标记
            redirectAttributes.addFlashAttribute("registrationFailed", true);
            // 注册失败后重定向到注册页面
            return new RedirectView("/registerPage.html");
        }
    }

}


