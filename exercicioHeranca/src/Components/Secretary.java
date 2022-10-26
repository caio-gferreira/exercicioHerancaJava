package Components;

public class Secretary  extends Employee {
    private String phone;
    private String ramal;

    public String getPhoneSecretary() {
        return this.phone;
    }

    public String getRamaleSecretary() {
        return this.ramal;
    }

    public String setPhoneSecretary(String phone) {
        return this.phone = phone;
    }

    public String setRamalSecretary(String ramal) {
        return this.ramal = ramal;
    }
}
