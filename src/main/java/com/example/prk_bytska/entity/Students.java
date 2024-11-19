package com.example.prk_bytska.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor

@Table(name = "students")
public class Students {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private Users user;
    private long userId;


}
