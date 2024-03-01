package model;

import java.sql.Date;

public class userModel {

    private Long userId;
    private String phoneNumber;
    private String password;
    private String userName;
    private Date registrationTime;
    private Date lastLoginTime;

   

    public userModel() {
    }

    public userModel(Long userId, String phoneNumber, String password, String userName, Date registrationTime, Date lastLoginTime) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.registrationTime = registrationTime;
        this.lastLoginTime = lastLoginTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}