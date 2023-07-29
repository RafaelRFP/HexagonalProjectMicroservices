package com.hexagonal.tasks.domain.models;

public class AdditionalTaskInfo {

    private final Long userid;
    private final String userName;
    private final String userEmail;

    public AdditionalTaskInfo(Long userid, String userName, String userEmail) {
        this.userid = userid;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public Long getUserid() {
        return userid;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
