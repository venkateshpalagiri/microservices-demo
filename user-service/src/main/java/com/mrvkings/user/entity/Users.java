package com.mrvkings.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private Long departmentId;

}
