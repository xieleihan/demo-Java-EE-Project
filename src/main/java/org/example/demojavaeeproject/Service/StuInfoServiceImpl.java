package org.example.demojavaeeproject.Service;

import org.example.demojavaeeproject.Model.StuInfo;
import org.example.demojavaeeproject.Repository.StuInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuInfoServiceImpl extends StuInfoService {

    @Autowired
    private StuInfoRepository stuInfoRepository;

    @Override
    public StuInfo getStuInfoByUsername(String username) {
        return stuInfoRepository.findByUsername(username);
    }

    @Override
    public List<StuInfo> getAllStuInfos() {
        return (List<StuInfo>) stuInfoRepository.findAll();
    }

    @Override
    public boolean updateStuInfo(StuInfo stuInfo) {
        if (stuInfoRepository.existsById(stuInfo.getId())) {
            stuInfoRepository.save(stuInfo);
            return true;
        }
        return false;
    }

    @Override
    public boolean addStuInfo(StuInfo stuInfo) {
        if (stuInfoRepository.findByUsername(stuInfo.getUsername()) == null) {
            stuInfoRepository.save(stuInfo);
            return true;
        }
        return false;
    }
}

