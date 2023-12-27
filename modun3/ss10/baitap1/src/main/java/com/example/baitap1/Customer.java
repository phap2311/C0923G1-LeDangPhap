package com.example.baitap1;

public class Customer {
    private String nameCustomer;
    private String birthday;
    private String address;
    private String cusImage;

    public Customer() {
    }


    public Customer(String nameCustomer, String birthday, String address, String cusImage) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.address = address;
        this.cusImage = cusImage;

    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCusImage() {
        return cusImage;
    }

    public void setCusImage(String cusImage) {
        this.cusImage = cusImage;
    }


    }

