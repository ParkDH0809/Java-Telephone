package telephone.model;

import java.util.*;

public class Telephones {
    private final List<Telephone> telephones = new ArrayList<>();

    public void addTelephone(Telephone telephone) {
        telephones.add(telephone);
    }

    public List<Telephone> getTelephones() {
        return Collections.unmodifiableList(telephones);
    }
}
