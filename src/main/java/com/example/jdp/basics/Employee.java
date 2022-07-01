package com.example.jdp.basics;

public class Employee {
  private int employeeId;
  private String password;
  private String employeeName;

  public Employee(int employeeId, String password, String employeeName) {
    this.employeeId = employeeId;
    this.password = password;
    this.employeeName = employeeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof Employee && ((Employee) o).employeeId == this.employeeId) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return this.employeeId;
  }
}
