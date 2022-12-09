package com.example.LibraryApp_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userRegister")
public class UserRegister {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String aadharno;
    private String adress;
    private int pincode;
    private String dateofbirth;
    private String emailid;
    private String phoneno;
    private String username;
    private String password;
    private String confirmpassword;

    public UserRegister() {
    }

    public UserRegister(int id, String name, String aadharno, String adress, int pincode, String dateofbirth, String emailid, String phoneno, String username, String password, String confirmpassword) {
        this.id = id;
        this.name = name;
        this.aadharno = aadharno;
        this.adress = adress;
        this.pincode = pincode;
        this.dateofbirth = dateofbirth;
        this.emailid = emailid;
        this.phoneno = phoneno;
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
