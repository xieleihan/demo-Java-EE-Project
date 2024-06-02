package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.AdminInfo;
import org.example.demojavaeeproject.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AdminLoginController {

    @Autowired
    private AdminService adminService;

    @CrossOrigin(origins = "*")
    @PostMapping("/adminlogin")
    public void login(@RequestParam String adminname, @RequestParam String password, HttpServletResponse response) throws IOException {
//        System.out.println("Received adminname: " + adminname);
//        System.out.println("Received password: " + password);

        AdminInfo adminInfo = adminService.validateAdmin(adminname, password);
        if (adminInfo != null) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid adminname or password");
        }
    }
}



