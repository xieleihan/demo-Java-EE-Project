package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.User;
import org.example.demojavaeeproject.Repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    // 假设你有一个 TeacherRepository 来访问数据库
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public User validateTeacher(String username, String password) {
        // 查询数据库中的用户
        User teacher = teacherRepository.findByUsername(username);

        // 检查密码是否匹配（这里假设密码是明文存储的，实际应用中应使用加密）
        if (teacher != null && teacher.getPassword().equals(password)) {
            return teacher;
        } else {
            return null;
        }
    }
}

