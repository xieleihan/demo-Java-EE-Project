// StuInfoService.java

package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.StuInfo;
import org.example.demojavaeeproject.Repository.StuInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuInfoService {
    @Autowired
    private StuInfoRepository stuInfoRepository;

    public StuInfo getStuInfoByUsername(String username) {
        return stuInfoRepository.findByUsername(username);
    }
}
