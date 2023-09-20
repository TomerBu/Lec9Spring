package edu.tomerbu.lec9.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 2, max = 30)
    private String username;

    @Size(min = 2, max = 30)
    private String email;

    @Size(min = 2, max = 30)
    private String password;
}
