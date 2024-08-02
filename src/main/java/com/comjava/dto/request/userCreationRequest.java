package com.comjava.dto.request;

//import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@AllArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class userCreationRequest {
//    @Size(min = 3, message = "USER_INVALID")
     String username;
//    @Size(min = 8,message = "USER_PASSWORD")
     String password;
     String firstname;
     String lastname;
     LocalDate date;

    public userCreationRequest() {
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
