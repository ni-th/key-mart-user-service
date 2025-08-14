package com.keymart.identity.dto;

import com.keymart.identity.enums.RegistrationMethod;
import com.keymart.identity.enums.UserRole;
import lombok.*;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long userId;
    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String passwordHash;
    private String phone;
    private UserRole role = UserRole.CUSTOMER;
    private RegistrationMethod registrationMethod = RegistrationMethod.MANUAL;
    private String oauthProvider;
    private String oauthId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
