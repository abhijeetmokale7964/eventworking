package com.rsl.event.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    
    // Primary key for the User entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    // First name of the User
    @NotBlank(message = "First name is required")
    @Column(name = "firstName")
    private String firstName;

    // Last name of the User
    @NotBlank(message = "Last name is required")
    @Column(name = "lastName")
    private String lastName;

    // Contact number of the User
    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    @Column(name = "phone_No")
    private String phoneNumber;

    // Email address of the User
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Column(name = "mail")
    private String email;

    // Address of the User
    @NotBlank(message = "Address is required")
    @Column(name = "address")
    private String address;

    // Name of the firm associated with the User
    @NotBlank(message = "Firm name is required")
    @Column(name = "firmName")
    private String firmName;

    // GST Number of the firm associated with the User (Optional)
    @Column(name = "gstn")
    private String gstin;

    // Password for the User account
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "Password must contain at least one digit, one lowercase letter, one uppercase letter, and one special character")
    @Column(name = "password")
    private String password;

    // Confirmation password for the User account
    @NotBlank(message = "Confirmation password is required")
    @Size(min = 8, message = "Confirmation password must be at least 8 characters long")
    @Column(name = "confirmPassword")
    private String confirmPassword;

    // Default constructor
    public User() {
        super();
    }

    // Parameterized constructor
    public User(String firstName, String lastName, String phoneNumber, String email, String address, String firmName,
                String gstin, String password, String confirmPassword) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.firmName = firmName;
        this.gstin = gstin;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
