package com.comjava.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    public String id;
    public String username;
    public String password;
    public String firstname;
    public String lastname;
    public LocalDate date;
    public Set<String> roles;
}
