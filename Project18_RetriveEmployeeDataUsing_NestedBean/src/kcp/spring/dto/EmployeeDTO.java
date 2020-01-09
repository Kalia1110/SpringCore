package kcp.spring.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO implements Serializable {
    private String ename, job;
    private String hireDate;
    private int empno, deptno,mgr;
    private double sal, comm;
}
