package org.example.Dto;

public class User {

    /**
     * 이름
     */
    private String name;

    /**
     * 나이
     */
    private String age;

    /**
     * 전화번호
     */
    private String phoneNumber;

    /**
     * 주소
     */
    private String address;

    // getter-setter
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getAge() {
        return this.age;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
}
