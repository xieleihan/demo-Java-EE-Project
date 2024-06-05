package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/teacher") // 添加一个类级别的请求映射,防止跟之前的URL冲突
public class TeacherLoginController {

    @Autowired
    private TeacherService teacherService;

    @CrossOrigin(origins = "*")
    @PostMapping("/teacherlogin")
    public void login(@RequestBody Map<String, String> loginData, HttpServletResponse response, HttpSession session) throws IOException {
        String username = loginData.get("username");
        String password = loginData.get("password");

        User teacher = teacherService.validateTeacher(username, password);
        if (teacher != null) {
            // Store user information in session
            session.setAttribute("user", teacher);

            // Create a cookie for session
            Cookie sessionCookie = new Cookie("SESSIONID", session.getId());
            sessionCookie.setHttpOnly(true);
            sessionCookie.setPath("/");
            sessionCookie.setMaxAge(7 * 24 * 60 * 60); // 1 week
            response.addCookie(sessionCookie);

            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid username or password");
        }
    }

    @GetMapping("/checkLoginStatus")
    public ResponseEntity<?> checkLoginStatus(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.hasRole("TEACHER")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        return ResponseEntity.ok().body(Map.of("status", "logged_in"));
    }
}
