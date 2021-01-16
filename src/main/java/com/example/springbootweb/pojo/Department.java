package com.example.springbootweb.pojo;
import lombok.Data;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;

}
