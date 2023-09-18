package telephone;

import java.util.InputMismatchException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telephone.validation.InputValidation;

public class TelePhoneTest {
    
    @DisplayName("전화번호 입력값 테스트")
    @Test
    void TelePhoneNumberValidationTest() {
        InputValidation inputValidation = new InputValidation();

        Assertions.assertThrows(InputMismatchException.class, () -> {
            inputValidation.validateTelephoneNumber("010-00-0000");
        });
    }
}
