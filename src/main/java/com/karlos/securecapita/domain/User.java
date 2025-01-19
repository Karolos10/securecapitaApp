package com.karlos.securecapita.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class User {

    private Long id;
    @NotEmpty(message = "First name cannot be empty")
    private String firstName;
    @NotEmpty(message = "Last name cannot be empty")
    private String lastName;
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Invalid email. Please enter a valid email address")
    private String email;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    private String address;
    private String phone;
    private String title;
    private String bio;
    private String imageUrl;
    private boolean enabled;
    private boolean isNotLocked;
    private boolean isUsingMfa;
    private LocalDateTime createdAt;

    public User() {
    }

    public User(Long id,
                String firstName,
                String lastName,
                String email,
                String password,
                String address,
                String phone,
                String title,
                String bio,
                String imageUrl,
                boolean enabled,
                boolean isNotLocked,
                boolean isUsingMfa,
                LocalDateTime createdAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.title = title;
        this.bio = bio;
        this.imageUrl = imageUrl;
        this.enabled = enabled;
        this.isNotLocked = isNotLocked;
        this.isUsingMfa = isUsingMfa;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty(message = "First name cannot be empty") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty(message = "First name cannot be empty") String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty(message = "Last name cannot be empty") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty(message = "Last name cannot be empty") String lastName) {
        this.lastName = lastName;
    }

    public @NotEmpty(message = "Email cannot be empty") @Email(message = "Invalid email. Please enter a valid email address") String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty(message = "Email cannot be empty") @Email(message = "Invalid email. Please enter a valid email address") String email) {
        this.email = email;
    }

    public @NotEmpty(message = "Password cannot be empty") String getPassword() {
        return password;
    }

    public void setPassword(@NotEmpty(message = "Password cannot be empty") String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isNotLocked() {
        return isNotLocked;
    }

    public void setNotLocked(boolean notLocked) {
        isNotLocked = notLocked;
    }

    public boolean isUsingMfa() {
        return isUsingMfa;
    }

    public void setUsingMfa(boolean usingMfa) {
        isUsingMfa = usingMfa;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
