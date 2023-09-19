package telephone.constants;

public enum ExceptionMessage {
    SELECT_NUMBER_LESS_THAN_MINIMUM_NUMBER("1 이상의 값을 선택해주세요."),
    SELECT_NUMBER_OVER_THAN_MAXIMUM_NUMBER("3 이하의 값을 선택해주세요."),
    MISS_INPUT_TELEPHONE_NUMBER("전화번호를 잘못 입력하였습니다."),
    INPUT_NAME_IS_NULL("성함을 적어주세요.");
    private final String exceptionMessage;

    ExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
    
    public void throwException() {
        throw new IllegalArgumentException(exceptionMessage);
    }
}
