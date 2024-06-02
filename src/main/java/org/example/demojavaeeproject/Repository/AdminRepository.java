package org.example.demojavaeeproject.Repository;

import org.example.demojavaeeproject.Model.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminInfo, String> {
    AdminInfo findByAdminname(String adminname);
}

