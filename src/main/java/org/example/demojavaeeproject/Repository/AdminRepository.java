package org.example.demojavaeeproject.Repository;

import org.example.demojavaeeproject.Model.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminInfo, String> {
}


