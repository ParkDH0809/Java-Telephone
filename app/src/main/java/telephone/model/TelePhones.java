package telephone.model;

import java.util.*;

public class TelePhones {
    private final List<TelePhone> telephones = new ArrayList<>();

    public void addTelephone(TelePhone telephone) {
        telephones.add(telephone);
    }

    public List<TelePhone> getTelePhones() {
        return Collections.unmodifiableList(telephones);
    }
}
