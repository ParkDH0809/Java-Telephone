package telephone.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import telephone.validation.InputValidation;

public class InputView {
    
    private static final String INPUT_TELEPHONE_NAME = "전화번호를 입력해주세요.";
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String inputTelephoneNumber() throws IOException{
        System.out.println(INPUT_TELEPHONE_NAME);
        return InputValidation.validateTelephoneNumber(bufferedReader.readLine());
    }
}