package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.StuInfo;
import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private StuInfoService stuInfoService;

    @GetMapping("/getAllStuInfos")
    public ResponseEntity<List<StuInfo>> getAllStuInfos(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.hasRole("TEACHER")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        List<StuInfo> stuInfos = stuInfoService.getAllStuInfos();
        return ResponseEntity.ok(stuInfos);
    }

    @PostMapping("/updateStuInfo")
    public ResponseEntity<?> updateStuInfo(@RequestBody StuInfo stuInfo, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.hasRole("TEACHER")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }

        boolean updated = stuInfoService.updateStuInfo(stuInfo);
        if (updated) {
            return ResponseEntity.ok("Student info updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to update student info");
        }
    }

    @PostMapping("/addStuInfo")
    public ResponseEntity<?> addStuInfo(@RequestBody StuInfo stuInfo, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.hasRole("TEACHER")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }

        boolean added = stuInfoService.addStuInfo(stuInfo);
        if (added) {
            return ResponseEntity.ok("Student info added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to add student info");
        }
    }
}

