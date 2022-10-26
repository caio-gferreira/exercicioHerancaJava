package Components;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String document;

    public int getIdEmployee() {
        return this.id;
    }

    public int setIdEmployee(int id) {
        return this.id = id;
    }

    public String getEmployeeName() {
        return this.name;
    }

    public String setEmployeeName(String name) {
        return this.name = name;
    }

    public String getEmployeeEmail() {
        return this.email;
    }

    public String setEmployeeEmail(String email) {
        return this.email = email;
    }

    public String getEmployeeDocument() {
        return this.document;
    }

    public String setEmployeeDocument(String document) {
        return this.document = document;
    }
}
