package com.icbt.ap.mobileaccessoriessales.controller.v1.model.response;

import com.icbt.ap.mobileaccessoriessales.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class CustomerLoginResponse {
    private String id;
    private String name;
    private String mobile;
    private String address;
    private String username;
    private UserRole userRole;
}
