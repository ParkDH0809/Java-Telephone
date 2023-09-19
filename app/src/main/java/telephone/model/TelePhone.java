package telephone.model;

public class TelePhone {

    String name;
    String telephoneNumber;

    public TelePhone(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String toString() {
        return "성함: " + this.name + ", 전화번호: " + this.telephoneNumber;
    };
}
