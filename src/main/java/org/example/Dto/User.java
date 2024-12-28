package org.example.Dto;

public class User {

    /**
     * User Name
     */
    private String name;

    /**
     * User Age
     */
    private String age;

    /**
     * User Phone Number
     */
    private String phoneNumber;

    /**
     * User Address
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
