package telephone.view;

public class OutputView {
    private static final String START_PROGRAM = "프로그램을 시작합니다.";
    private static final String PRINT_INPUT_TELEPONE_NUMBER = "입력한 전화번호:";

    public void startProgram() {
        System.out.println(START_PROGRAM);
    }

    public void printInputTelephoneNumber(String telephoneNumber) {
        System.out.println(PRINT_INPUT_TELEPONE_NUMBER);
        System.out.println(telephoneNumber);
    }
}
