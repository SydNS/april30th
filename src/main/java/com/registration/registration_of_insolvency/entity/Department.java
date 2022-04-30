package com.registration.registration_of_insolvency.entity;

import com.registration.registration_of_insolvency.contoller.response.DeptResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Schema
@NoArgsConstructor
public class Department {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    @NotEmpty
    private String deptName;
    @Column
    @NotEmpty
    private String deptAddress;
    @Column
    @NotEmpty
    private String deptCode;

    public Department(String deptName, String deptAddress, String deptCode) {
        this.deptName = deptName;
        this.deptAddress = deptAddress;
        this.deptCode = deptCode;
    }
    public DeptResponse asResponse(){ return new DeptResponse(deptName,deptAddress,deptCode);}
}
