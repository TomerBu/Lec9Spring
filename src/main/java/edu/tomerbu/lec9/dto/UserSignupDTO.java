package edu.tomerbu.lec9.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignupDTO {
    @NotNull
    @Size(min = 2, max = 30)
    private String username;

    @NotNull
    @Email(regexp = "^([\\w\\-\\.]+)@([\\w\\-]+)\\.([\\w\\-\\.]){2,}$")
    @Size(min = 2, max = 30)
    private String email;

    @NotNull
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*!@$%^&]).{8,32}$")
    @Size(min = 2, max = 30)
    private String password;
}
