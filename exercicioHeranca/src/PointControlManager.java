import java.time.LocalDate;
import java.time.LocalDateTime;

import Components.EmployeeManager;
import Components.EmployeeOperator;
import Components.EmployeeSecretary;
import Controllers.EmployeeController;
import Controllers.PointRegister;

public class PointControlManager {
    public static void main(String[] args) throws InterruptedException {
        EmployeeManager manager1 = new EmployeeManager();
        EmployeeOperator operator1 = new EmployeeOperator();
        // EmployeeSecretary secretary1 = new EmployeeSecretary();
        EmployeeController controller = new EmployeeController();
        controller.createEmployee("Secretária", "Luke Skywalker", "153.346.660-28", "luke.jedi@java", 3);

        // manager1.setIdEmployee(1);
        // manager1.setEmployeeName("Caio Ferreira");
        // manager1.setEmployeeDocument("476.034.230-31");
        // manager1.setEmployeeEmail("caio.ferreira@java");
        // manager1.setLogin("admin");
        // manager1.setPassword("adming1234");

        // PointRegister pointRegisterManager = new PointRegister();
        // pointRegisterManager.setEmployee(manager1);
        // pointRegisterManager.setRegisterDate(LocalDate.now());
        // pointRegisterManager.setStartHour(LocalDateTime.now());
        // pointRegisterManager.setEndHour(LocalDateTime.now());

        // pointRegisterManager.showData();
        // Thread.sleep(2000);

        // operator1.setIdEmployee(2);
        // operator1.setEmployeeName("Legolas Folha Verde");
        // operator1.setEmployeeDocument("820.436.370-29"); 
        // operator1.setEmployeeEmail("legolas.folha@java");
        // operator1.setHourValue(20.0);

        // PointRegister pointRegisterOperator = new PointRegister();
        // pointRegisterOperator.setEmployee(operator1);
        // pointRegisterOperator.setRegisterDate(LocalDate.now());
        // pointRegisterOperator.setStartHour(LocalDateTime.now());
        // pointRegisterOperator.setEndHour(LocalDateTime.now());

        // pointRegisterOperator.showData();
        // Thread.sleep(2000);
        

        // PointRegister pointRegisterSecretary = new PointRegister();
        // pointRegisterSecretary.setEmployee(secretary1);
        // pointRegisterSecretary.setRegisterDate(LocalDate.now());
        // pointRegisterSecretary.setStartHour(LocalDateTime.now());
        // pointRegisterSecretary.setEndHour(LocalDateTime.now());

        // pointRegisterSecretary.showData();
    }
}
