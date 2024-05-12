package org.example.demojavaeeproject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stuinfo")
public class StuInfo {
    @Id
    private String username;

    @Column(name = "stuname")
    private String stuname;

    @Column(name = "stuid")
    private String stuid;

    @Column(name = "grade")
    private String grade;

    @Column(name = "class")
    private String studentClass;

    // 无参构造函数
    public StuInfo() {
    }

    public StuInfo(String username, String stuname, String stuid, String grade, String studentClass) {
        this.username = username;
        this.stuname = stuname;
        this.stuid = stuid;
        this.grade = grade;
        this.studentClass = studentClass;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}


