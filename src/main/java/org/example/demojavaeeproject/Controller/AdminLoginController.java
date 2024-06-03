package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.AdminInfo;
import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@RestController
public class AdminLoginController {

    @Autowired
    private AdminService adminService;

    @CrossOrigin(origins = "*")
    @PostMapping("/adminlogin")
    public void login(@RequestParam String adminname, @RequestParam String password, HttpServletResponse response, HttpSession session) throws IOException {
        AdminInfo adminInfo = adminService.validateAdmin(adminname, password);
        if (adminInfo != null) {
            // Store user information in session
            User user = new User(adminname, Set.of("ADMIN"));
            session.setAttribute("user", user);
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid adminname or password");
        }
    }

    @GetMapping("/checkLoginStatus")
    public ResponseEntity<?> checkLoginStatus(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.hasRole("ADMIN")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        return ResponseEntity.ok().body(Map.of("status", "logged_in"));
    }
}





