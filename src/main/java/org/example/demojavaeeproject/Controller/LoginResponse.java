package org.example.demojavaeeproject.Controller;

import org.example.demojavaeeproject.Model.StuInfo;

public class LoginResponse {
    private String message;
    private StuInfo stuInfo;

    public LoginResponse(String message, StuInfo stuInfo) {
        this.message = message;
        this.stuInfo = stuInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StuInfo getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(StuInfo stuInfo) {
        this.stuInfo = stuInfo;
    }
}
