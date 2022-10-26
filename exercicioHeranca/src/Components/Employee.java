package Components;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String document;
    private String jobPosition;

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

    public String getJobPosition() {
        return this.jobPosition;
    }

    public String setJobPosition(String jobPosition) {
        return this.jobPosition = jobPosition;
    }
}
