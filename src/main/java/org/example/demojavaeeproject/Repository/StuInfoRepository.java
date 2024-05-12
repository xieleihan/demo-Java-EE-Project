package org.example.demojavaeeproject.Repository;

import org.example.demojavaeeproject.Model.StuInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuInfoRepository extends CrudRepository<StuInfo, Long> {
    StuInfo findByUsername(String username);
}
