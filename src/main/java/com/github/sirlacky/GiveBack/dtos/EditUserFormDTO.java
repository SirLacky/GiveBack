package com.github.sirlacky.GiveBack.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditUserFormDTO {
        private Long id;
        private String username;
        private String password;
        @NotBlank
        private String firstName;
        @NotBlank
        private String lastName;

}
