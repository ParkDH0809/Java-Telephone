package telephone.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import telephone.validation.InputValidation;

public class InputView {
    
    private static final String INPUT_TELEPHONE_NAME = "전화번호를 입력해주세요.";
    private static final String SELECT_NUMBER = "원하시는 동작에 대한 번호를 입력해주세요,";
    private static final String INPUT_SELECT_NUMBER = "1. 전화번호 입력, 2. 전화번호 리스트 확인, 3. 전화번호 검색";

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int selectNumber() {
        System.out.println(SELECT_NUMBER + "\n" + INPUT_SELECT_NUMBER);
        return InputValidation.validateSelectNumber(Integer.parseInt(bufferedReader.readLine()));
    }


    public String inputTelephoneNumber() throws IOException {
        System.out.println(INPUT_TELEPHONE_NAME);
        return InputValidation.validateTelephoneNumber(bufferedReader.readLine());
    }
}
