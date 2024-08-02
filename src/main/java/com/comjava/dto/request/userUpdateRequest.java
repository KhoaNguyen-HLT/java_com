package com.comjava.dto.request;

import lombok.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

@FieldDefaults(level = AccessLevel.PRIVATE)
public class userUpdateRequest {
     String password;
     String firstname;
     String lastname;
     LocalDate date;

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
