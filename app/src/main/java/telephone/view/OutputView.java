package telephone.view;

import java.util.List;

import telephone.model.Telephone;

public class OutputView {
    private static final String START_PROGRAM = "프로그램을 시작합니다.";
    private static final String END_PROGRAM = "프로그램을 종료합니다.";
    private static final String PRINT_INPUT_TELEPONE_INFO = "정보가 추가되었습니다.";
    private static final String PRINT_TELEPHONE_SEARCH_RESULT = "검색 결과입니다.";

    public void startProgram() {
        System.out.println(START_PROGRAM);
    }

    public void endProgram() {
        System.out.println(END_PROGRAM);
    }

    public void printInputTelephoneNumber(Telephone telephone) {
        System.out.println(telephone.toString());
    }

    public void printInputInfoCompleted() {
        System.out.println(PRINT_INPUT_TELEPONE_INFO);
    }

    public void printTelephoneSearchResult(List<Telephone> searchResultList) {
        System.out.println(PRINT_TELEPHONE_SEARCH_RESULT);
        for(Telephone telephone : searchResultList) {
            System.out.println(telephone.toString());
        }
    }
}
