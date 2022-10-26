package Controllers;

import java.util.List;

import javax.swing.text.html.HTMLEditorKit.Parser;

import org.xml.sax.helpers.ParserAdapter;

import java.util.ArrayList;

import Components.Employee;
import Components.EmployeeManager;
import Components.EmployeeOperator;
import Components.EmployeeSecretary;

public class EmployeeController {
    private List<Employee> employeeList;
    // private EmployeeManager employeeManager;
    // private EmployeeOperator employeeOperator;
    // private EmployeeSecretary employeeSecretary;

    public EmployeeController() {
        this.employeeList = new ArrayList<>();
    }

    public boolean createEmployee(String jobPosition, String name, String document, String email, int id) {
        if (jobPosition.equals("Gerente")) {
            EmployeeManager employeeManager = new EmployeeManager();

            employeeManager.setEmployeeName(name);
            employeeManager.setEmployeeDocument(document);
            employeeManager.setEmployeeEmail(email);
            employeeManager.setIdEmployee(id);

            return this.employeeList.add(employeeManager);
        } else if (jobPosition.equals("Operador")) {
            EmployeeOperator employeeOperator = new EmployeeOperator();

            employeeOperator.setEmployeeName(name);
            employeeOperator.setEmployeeDocument(document);
            employeeOperator.setEmployeeEmail(email);
            employeeOperator.setIdEmployee(id); 

            return this.employeeList.add(employeeOperator);
        } else if (jobPosition.equals("Secretária")) {
            EmployeeSecretary employeeSecretary = this.setEmployeeSecretary(name, document, email, id);

            return this.employeeList.add(employeeSecretary);
        }

       
        return false;
    }

    private EmployeeSecretary setEmployeeSecretary(String name, String document, String email, int id) {
        EmployeeSecretary employeeSecretary = new EmployeeSecretary();

        if(name.equals("") || name.equals(null)) System.out.println("Preencha o campo Nome");
        if(document.equals("") || document.equals(null)) System.out.println("Preencha o campo Documento");
        if(email.equals("") || email.equals(null)) System.out.println("Preencha o campo Email");

        employeeSecretary.setEmployeeName(name);
        employeeSecretary.setEmployeeDocument(document);
        employeeSecretary.setEmployeeEmail(email);
        employeeSecretary.setIdEmployee(id); 

        return employeeSecretary;
    }
}
