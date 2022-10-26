package Components;

public class EmployeeManager extends Employee {
    private String login;
    private String password;

    public EmployeeManager() {
        this.setJobPosition("Gerente");
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String setLogin(String login) {
        return this.login = login;
    }

    public String setPassword(String password) {
        return this.password = password;
    }
}
