package br.com.gabiru.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @NotBlank(message = "Username should not be blank")
    @Pattern(regexp = "\\S+", message = "Username should be valid")
    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @Length(min = 10, max = 20, message = "Password should be between 10 and 20 characters")
    private String password;
    private String description;
    private String curriculum;

}
