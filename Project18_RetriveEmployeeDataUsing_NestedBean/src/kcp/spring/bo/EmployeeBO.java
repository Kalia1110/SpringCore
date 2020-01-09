package kcp.spring.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeBO {
    
    private String ename, job;
    private String  hireDate;
    private int empno,mgr, deptno;
    private double sal, comm;
   
}
