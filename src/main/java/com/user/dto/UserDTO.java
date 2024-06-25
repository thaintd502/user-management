package com.user.dto;

public class UserDTO {
    private String createdBy;
    private String email;
    private String googleUserId;
    private String loginType;
    private String mobile;
    private String name;
    private String password;
    private String photoUrl;
    private String status;
    private String sysUserType;
    private String userType;
    private String username;

    public UserDTO() {
    }

    public UserDTO(String createdBy, String email, String googleUserId, String loginType, String mobile, String name, String password, String photoUrl, String status, String sysUserType, String userType, String username) {
        this.createdBy = createdBy;
        this.email = email;
        this.googleUserId = googleUserId;
        this.loginType = loginType;
        this.mobile = mobile;
        this.name = name;
        this.password = password;
        this.photoUrl = photoUrl;
        this.status = status;
        this.sysUserType = sysUserType;
        this.userType = userType;
        this.username = username;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoogleUserId() {
        return googleUserId;
    }

    public void setGoogleUserId(String googleUserId) {
        this.googleUserId = googleUserId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSysUserType() {
        return sysUserType;
    }

    public void setSysUserType(String sysUserType) {
        this.sysUserType = sysUserType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
