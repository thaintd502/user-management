package com.user.entity;


import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "google_user_id", unique = true)
    private String googleUserId;

    @Column(name = "last_failed_login_date")
    private LocalDateTime lastFailedLoginDate;

    @Column(name = "last_login_date")
    private LocalDateTime lastLoginDate;

    @Column(name = "lockout_date")
    private LocalDateTime lockoutDate;

    @Column(name = "login_fail_count")
    private Integer loginFailCount;

    @Column(name = "login_type")
    private String loginType;

    @Column(name = "mobile", unique = true)
    private String mobile;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "photo")
    private byte[] photo;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "status")
    private String status;

    @Column(name = "sys_user_type")
    private String sysUserType;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "username", unique = true)
    private String username;

    public User() {
    }

    public User(LocalDateTime lastFailedLoginDate, Long id, String createdBy, LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate, String email, String googleUserId, LocalDateTime lastLoginDate, LocalDateTime lockoutDate, Integer loginFailCount, String loginType, String mobile, String name, String password, byte[] photo, String photoUrl, String status, String sysUserType, String userType, String username) {
        this.lastFailedLoginDate = lastFailedLoginDate;
        this.id = id;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.email = email;
        this.googleUserId = googleUserId;
        this.lastLoginDate = lastLoginDate;
        this.lockoutDate = lockoutDate;
        this.loginFailCount = loginFailCount;
        this.loginType = loginType;
        this.mobile = mobile;
        this.name = name;
        this.password = password;
        this.photo = photo;
        this.photoUrl = photoUrl;
        this.status = status;
        this.sysUserType = sysUserType;
        this.userType = userType;
        this.username = username;
    }

    public LocalDateTime getLastFailedLoginDate() {
        return lastFailedLoginDate;
    }

    public void setLastFailedLoginDate(LocalDateTime lastFailedLoginDate) {
        this.lastFailedLoginDate = lastFailedLoginDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
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

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public LocalDateTime getLockoutDate() {
        return lockoutDate;
    }

    public void setLockoutDate(LocalDateTime lockoutDate) {
        this.lockoutDate = lockoutDate;
    }

    public Integer getLoginFailCount() {
        return loginFailCount;
    }

    public void setLoginFailCount(Integer loginFailCount) {
        this.loginFailCount = loginFailCount;
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
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

