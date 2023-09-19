package telephone.view;

// import java.io.*;

import java.util.Scanner;
import telephone.validation.InputValidation;

public class InputView {
    private static final String SELECT_NUMBER = "원하시는 동작에 대한 번호를 입력해주세요. \n"
                                                 + "1. 전화번호 입력, 2. 전화번호 리스트 확인, 3. 전화번호 검색, 0. 종료";
    private static final String INPUT_NAME = "성함을 입력해주세요.(필수)";
    private static final String INPUT_TELEPHONE_NUMBER = "전화번호를 입력해주세요.(필수)";
    private static final String INPUT_SEARCH_INFO = "검색어를 입력해주세요.";
    
    // private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);

    public int selectNumber() {
        System.out.println(SELECT_NUMBER);
        return InputValidation.validateSelectNumber(Integer.parseInt(scanner.nextLine()));
    }

    public String inputName() {
        System.out.println(INPUT_NAME);
        return InputValidation.validateName(scanner.nextLine());
    }

    public String inputTelephoneNumber() {
        System.out.println(INPUT_TELEPHONE_NUMBER);
        return InputValidation.validateTelephoneNumber(scanner.nextLine());
    }

    public String inputSearchString() {
        System.out.println(INPUT_SEARCH_INFO);
        return InputValidation.validateSearchString(scanner.nextLine());
    }
}
