package telephone.validation;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {
    
    public static String validateTelephoneNumber(String number) {
        Pattern pattern = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");
        Matcher matcher = pattern.matcher(number);

        if(!matcher.matches()) {
            throw new InputMismatchException("전화번호를 잘못 입력하였습니다.");
        } 
        
        return number;
    }
}
