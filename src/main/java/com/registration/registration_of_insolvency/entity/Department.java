package com.registration.registration_of_insolvency.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Data
public class Department {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String DeptName;
    @Column
    private String DeptAddress;
    @Column
    private String DeptCode;
}
