package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.AdminInfo;
import org.example.demojavaeeproject.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public AdminInfo validateAdmin(String adminname, String password) {
        AdminInfo adminInfo = adminRepository.findById(adminname).orElse(null);
        if (adminInfo != null && adminInfo.getPassword().equals(password)) {
            return adminInfo;
        }
        return null;
    }
}


