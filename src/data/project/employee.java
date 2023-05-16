/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.project;

/**
 *
 * @author mobi lap
 */
public class employee {
    private int emp_no;
    private String name;
    private double salary;
    private String department;
    private String dob;

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }
    public int getEmp_no() {
        return emp_no;
    }
     public void setname(String name) {
        this.name=name;
    }
    public String getname() {
        return name;
    }
     public void setsalary(double salary) {
        this.salary = salary;
    }
    public double getsalary() {
        return salary;
    }
     public void setdepartment(String department) {
        this.department=department;
    }
    public String getdepartment() {
        return department;
    }
     public void setdob(String dob) {
        this.dob=dob;
    }
    public String getdob() {
        return dob;
    }
    public employee(int emp_no,String name,double salary,String department,String dob)
    {
        this.emp_no=emp_no;
        this.salary=salary;
        this.name=name;
        this.department=department;
        this.dob=dob;
    }
}
