package com.example.studentmanagement;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

public class Entity {

    @jakarta.persistence.Entity
    @Table(name = "students")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank(message = "Name is required")
        private String name;

        @NotBlank(message = "Email is required")
        @Column(unique = true)
        private String email;

    }
}