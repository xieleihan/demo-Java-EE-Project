package org.example.demojavaeeproject.Repository;

import org.example.demojavaeeproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
