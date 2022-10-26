package Controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Components.Employee;

public class PointRegister {
    private long id;
    private LocalDate dateRegister;
    private Employee employee;
    private LocalDateTime startHour;
    private LocalDateTime endHour;

    public long getRegisterId() {
        return this.id;
    }

    public long setRegisterId(long id) {
        return this.id = id;
    }

    public LocalDate getRegisterDate() {
        return this.dateRegister;
    }

    public LocalDate setRegisterDate(LocalDate date) {
        return this.dateRegister = date;
    }

    public LocalDateTime setStartHour(LocalDateTime startHour){
        return this.startHour = startHour; 
    }

    public LocalDateTime getStartHour() {
        return this.startHour; 
    }

    public LocalDateTime setEndHour(LocalDateTime endHour) {
        return this.endHour = endHour;
    }

    public LocalDateTime getEndHour() {
        return this.endHour;
    }

    public Employee setEmployee(Employee employee) {
        return this.employee = employee;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void showData() {
        Employee employe = this.getEmployee();
        System.out.println("=======================================================");
        System.out.println("Funcionário: " + employe.getEmployeeName());
        System.out.println("Data de Registro: " + this.getRegisterDate());
        System.out.println("Horário de Entrada: " + this.getStartHour());
        System.out.println("Horário de Saída: " + this.getEndHour());
    }
}
