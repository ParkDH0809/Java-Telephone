package telephone.view;

import telephone.model.TelePhone;

public class OutputView {
    private static final String START_PROGRAM = "프로그램을 시작합니다.";
    private static final String END_PROGRAM = "프로그램을 종료합니다.";
    private static final String PRINT_INPUT_TELEPONE_INFO = "정보가 추가되었습니다.";

    public void startProgram() {
        System.out.println(START_PROGRAM);
    }

    public void endProgram() {
        System.out.println(END_PROGRAM);
    }

    public void printInputTelephoneNumber(TelePhone telephone) {
        System.out.println(PRINT_INPUT_TELEPONE_INFO);
        System.out.println(telephone.toString());
    }
}
