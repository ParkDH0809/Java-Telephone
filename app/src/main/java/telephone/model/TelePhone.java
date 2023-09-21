package telephone.model;

public class Telephone {

    private String name;
    private String telephoneNumber;

    public Telephone(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String toString() {
        return "성함: " + getName() + ", 전화번호: " + getTelephoneNumber();
    };
}
