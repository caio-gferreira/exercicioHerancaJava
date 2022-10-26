package Controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Components.Employee;
import Components.EmployeeManager;
import Components.EmployeeOperator;

public class PointRegister {
    private long id;
    // private EmployeeManager employeeManager;
    // private EmployeeOperator employeeOperator;
    private LocalDate dateRegister;
    private LocalDateTime startHour;
    private LocalDateTime endHour;
    private List<Employee> employeeList;

    public PointRegister() {
        this.employeeList = new ArrayList<>();
    }

    public boolean createEmployee(String jobPosition, String name, String document, String email, int id) {
        if (jobPosition.equals("Gerente")) {
            EmployeeManager employeeManager = new EmployeeManager();

            employeeManager.setEmployeeName(name);
            employeeManager.setEmployeeDocument(document);
            employeeManager.setEmployeeEmail(email);
            employeeManager.setIdEmployee(id);

            this.employeeList.add(employeeManager);
            return true;
        } else if (jobPosition.equals("Operador")) {
            EmployeeOperator employeeOperator = new EmployeeOperator();

            employeeOperator.setEmployeeName(name);
            employeeOperator.setEmployeeDocument(document);
            employeeOperator.setEmployeeEmail(email);
            employeeOperator.setIdEmployee(id); 

            this.employeeList.add(employeeOperator);
            return true;
        }
        return false;
    }

    public long getRegisterId() {
        return this.id;
    }

    public long setRegisterId(long id) {
        return this.id = id;
    }

    // public Employee getEmployee() {
    //     return this.employee;
    // }

    // public Employee setEmployee(Employee employee) {
    //     return this.employee = employee;
    // }

     public LocalDate getRegisterDate() {
        return this.dateRegister;
    }

    public LocalDateTime setStartHour(LocalDateTime startHour){
        return this.startHour = startHour; 
    }

    public LocalDateTime getStartHour() {
        return this.startHour; 
    }

    public LocalDateTime setRegisterEndHour(LocalDateTime endHour) {
        return this.endHour = endHour;
    }

    public LocalDateTime getRegisterEndHour() {
        return this.endHour;
    }
}
