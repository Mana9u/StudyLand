package org.example.Dto;

import lombok.Data;
import java.time.LocalTime;

@Data
public class User {

    /**
     * User Name
     */
    private String name;

    /**
     * User Pw
     */
    private String pw;

    /**
     * User Email
     */
    private String email;

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
    public void setName(String name){ this.name = name; }

    public String getName() { return this.name; }

    public void setPw(String pw){ this.pw = pw; }

    public String getPw() { return this.pw; }

    public void setFirstTimePwFlg(String firstTimePwFlg){ this.firstTimePwFlg = firstTimePwFlg; }

    public String getFirstTimePwFlg() { return this.firstTimePwFlg; }

    public void setEmail(String email){ this.email = email; }

    public String getEmail() { return this.email; }

    public void setCreateDatetime(LocalTime createDatetime) { this.createDatetime = createDatetime; }

    public LocalTime getCreateDatetime(String createDatetime) { return this.createDatetime; }

    public void setCreateUser(String createUser) { this.createUser = createUser; }

    public String getCreateUser(String createUser) { return this.createUser; }

    public void setUpdateDatetime(LocalTime updateDatetime) { this.updateDatetime = updateDatetime; }

    public LocalTime getUpdateDatetime(String updateDatetime) { return this.updateDatetime; }

    public void setUpdateUser(String updateUser) { this.updateUser = updateUser; }

    public String getUpdateUser(String updateUser) { return this.updateUser; }

}
