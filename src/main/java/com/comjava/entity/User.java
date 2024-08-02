package com.comjava.entity;

import jakarta.persistence.*;
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
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public String id;
    public String username;
    public String password;
    public String firstname;
    public String lastname;
    public LocalDate date;
    @ElementCollection
    public Set<String> roles;



}
