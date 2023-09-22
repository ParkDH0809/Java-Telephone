package telephone;

import java.util.InputMismatchException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telephone.validation.InputValidation;

public class TelePhoneTest {
    
    @DisplayName("전화번호 입력값 테스트 - 잘못 입력한 경우")
    @Test
    void TelePhoneNumberValidationTest() {
        InputValidation inputValidation = new InputValidation();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inputValidation.validateTelephoneNumber("00-0000-0000");
            inputValidation.validateTelephoneNumber("010-000-0000");
            inputValidation.validateTelephoneNumber("010-000-000");
            inputValidation.validateTelephoneNumber("010-0000-000");
            inputValidation.validateTelephoneNumber("010-000-00000");
        });
    }

    @DisplayName("이름 입력값 테스트 - 입력값이 없는 경우")
    @Test
    void TelephoneNameValidationTest() {
        InputValidation inputValidation = new InputValidation();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inputValidation.validateName("");
        });
    }
}
