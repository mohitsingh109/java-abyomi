package org.example.classandobject;

public class Person {

    // Data Member??
    // Name, address, email, phoneNumber, ...
    // AM DT VN

    // Java: Always make your data member as private reason for this is security
    private String name; // AM: public, default, private, protacted

    private String address;

    private String email;

    private String phoneNumber;

    public void printDetails() { // Object Function
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Getter & Setter

    //Getter is function
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter

    public void setName(String name) {
        this.name = name; // this refer to the current object
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
