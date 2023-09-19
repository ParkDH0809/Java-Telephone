package telephone.validation;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import telephone.constants.ExceptionMessage;

public class InputValidation {
    private static final int MINIMUM_SELECT_NUMBER = 1;
    private static final int MAXIMUM_SELECT_NUMBER = 1;


    public static String validateTelephoneNumber(String number) {
        Pattern pattern = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");
        Matcher matcher = pattern.matcher(number);

        if(!matcher.matches()) {
            throw new InputMismatchException("전화번호를 잘못 입력하였습니다.");
        } 

        return number;
    }

    public static int validateSelectNumber(int number) {
        if(number < MINIMUM_SELECT_NUMBER) {
            ExceptionMessage.SELECT_NUMBER_LESS_THAN_MINIMUM_NUMBER.throwException();
        }

        if(number > MAXIMUM_SELECT_NUMBER) {
            ExceptionMessage.SELECT_NUMBER_OVER_THAN_MAXIMUM_NUMBER.throwException();
        }
        return number;
    }
}
