package com.lucle.user_management_service.dto;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 4, message = "USERNAME_INVALID")
    String username;

    @Size(min = 6, message = "INVALID_PASSWORD. Password must be at least 6 characters.")
    String password;

    String firstName;
    String lastName;

//    @DobConstraint(min = 10, message = "INVALID_DOB")
    LocalDate dob;
}
