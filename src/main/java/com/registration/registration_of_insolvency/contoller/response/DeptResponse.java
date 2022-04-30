package com.registration.registration_of_insolvency.contoller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptResponse {
    private String DeptName;
    private String DeptAddress;
    private String DeptCode;
}
