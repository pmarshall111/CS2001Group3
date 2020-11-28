package com.group3.backend.ui.model.request;

//we use different classes for requests in vs responses out. In this case it doesn't matter as they are the
// same, but if we had a UserRequestModel, which accepts a password, we wouldn't want to send that
// out again
public class PharmacyDetailsRequestModel {
    private String email;
    private String address;
    private String phoneNumb;
    private Long userId;
    private String name;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }
}
