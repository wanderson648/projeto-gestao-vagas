package com.wo.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] não deve conter espaços")
    private String username;

    @Email(message = "O campo (email) deve conter um e-mail válido")
    private String email;
    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;


}
