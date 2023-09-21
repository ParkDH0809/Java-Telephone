package telephone.service;

import java.util.*;

import telephone.model.Telephone;
import telephone.model.Telephones;

public class TelephoneSearchService {
    public List<Telephone> searchTelephones(Telephones telephones, String searchString) {
        List<Telephone> searchList = new ArrayList<>();
        for(int i = 0; i < telephones.getTelephones().size(); i++) {
            Telephone currentTelephone = telephones.getTelephones().get(i);
            if(checkTelephoneInfo(currentTelephone, searchString)) {
                searchList.add(currentTelephone);
            }
        }
        return Collections.unmodifiableList(searchList);
    }

    public boolean checkTelephoneInfo(Telephone telephone, String searchString) {
        if(telephone.getName().contains(searchString)) {
            return true;
        }
        if(telephone.getTelephoneNumber().contains(searchString)) {
            return true;
        }
        return false;
    }
}
