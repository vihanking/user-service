package com.adp.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    private String userName;

    @Column
    private String firstname;

    @Column
    private String lastname;

    private String mobileNo;

    @Email
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
