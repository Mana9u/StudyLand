package org.example.Dto;

import lombok.Data;
import java.time.LocalTime;

@Data
public class User {

    /**
     * User List No
     */
    private int userListNo;

    /**
     * User ID
     */
    private String userId;

    /**
     * User Name
     */
    private String userName;

    /**
     * User Pw
     */
    private String userPw;

    /**
     * User Email
     */
    private String userEmail;

    /**
     * First Time Pw Flag
     */
    private String firstTimePwFlg;

    /**
     * Create Datetime
     */
    private LocalTime createDatetime;

    /**
     * Create User
     */
    private String createUser;

    /**
     * Update Datetime
     */
    private LocalTime updateDatetime;

    /**
     * Update User
     */
    public String updateUser;

    // getter-setter
    public void setUserListNo(int userListNo){
        System.out.println("UserListNo() call succeeded");
        this.userListNo = userListNo;
    }

    public int getUserListNo() { return this.userListNo; }

    public void setUserId(String userId){
        System.out.println("UserId() call succeeded");
        this.userId = userId;
    }

    public String getUserId() { return this.userId; }

    public void setUserName(String userName){
        System.out.println("UserName() call succeeded");
        this.userName = userName;
    }

    public String getUserName() { return this.userName; }

    public void setUserPw(String userPw){
        System.out.println("UserPw() call succeeded");
        this.userPw = userPw;
    }

    public String getUserPw() { return this.userPw; }

    public void setUserEmail(String userEmail){
        System.out.println("UserEmail() call succeeded");
        this.userEmail = userEmail;
    }

    public String getUserEmail() { return this.userEmail; }

    public void setFirstTimePwFlg(String firstTimePwFlg){
        System.out.println("FirstTimePwFlg() call succeeded");
        this.firstTimePwFlg = firstTimePwFlg;
    }

    public String getFirstTimePwFlg() { return this.firstTimePwFlg; }

    public void setCreateDatetime(LocalTime createDatetime) {
        System.out.println("CreateDatetime() call succeeded");
        this.createDatetime = createDatetime;
    }

    public LocalTime getCreateDatetime(String createDatetime) { return this.createDatetime; }

    public void setCreateUser(String createUser) {
        System.out.println("CreateUser() call succeeded");
        this.createUser = createUser;
    }

    public String getCreateUser(String createUser) { return this.createUser; }

    public void setUpdateDatetime(LocalTime updateDatetime) {
        System.out.println("UpdateDatetime() call succeeded");
        this.updateDatetime = updateDatetime;
    }

    public LocalTime getUpdateDatetime(String updateDatetime) { return this.updateDatetime; }

    public void setUpdateUser(String updateUser) {
        System.out.println("UpdateUser() call succeeded");
        this.updateUser = updateUser;
    }

    public String getUpdateUser(String updateUser) { return this.updateUser; }

}
