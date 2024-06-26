// StuInfoService.java

package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.StuInfo;
import org.example.demojavaeeproject.Repository.StuInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuInfoService {
    @Autowired
    private StuInfoRepository stuInfoRepository;

    public StuInfo getStuInfoByUsername(String username) {
        return stuInfoRepository.findByUsername(username);
    }


    public List<StuInfo> getAllStuInfos() {
        return null;
    }

    public boolean updateStuInfo(StuInfo stuInfo) {
        return false;
    }

    public boolean addStuInfo(StuInfo stuInfo) {
        return false;
    }
}
