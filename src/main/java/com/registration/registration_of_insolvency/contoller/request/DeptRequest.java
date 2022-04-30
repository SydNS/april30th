package com.registration.registration_of_insolvency.contoller.request;

import com.registration.registration_of_insolvency.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class DeptRequest {
    @NotNull
    private String deptName;
    @NotEmpty
    private String deptAddress;
    @NotNull
    private String deptCode;

    public Department asRequest(){ return new Department(deptName,deptAddress,deptCode);}
}
