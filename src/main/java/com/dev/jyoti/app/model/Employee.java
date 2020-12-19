package com.dev.jyoti.app.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Employee {
    @Id
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String company;
    private double yearsOfExp;
    private double salary;
}
