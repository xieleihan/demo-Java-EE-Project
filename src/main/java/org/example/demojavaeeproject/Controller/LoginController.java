package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Model.StuInfo;
import org.example.demojavaeeproject.Service.UserService;
import org.example.demojavaeeproject.Service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private StuInfoService stuInfoService;

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestParam("username") String username,
                                               @RequestParam("password") String password) {
        User user = userService.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            StuInfo stuInfo = stuInfoService.getStuInfoByUsername(username);
            LoginResponse response = new LoginResponse("登录成功", stuInfo);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new LoginResponse("用户名或密码错误", null));
        }
    }
}