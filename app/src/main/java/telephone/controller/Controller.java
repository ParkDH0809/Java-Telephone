package telephone.controller;

import telephone.view.InputView;
import telephone.view.OutputView;

public class Controller {
    private static final int INPUT_TELEPHONE_NUMBER = 1;
    private static final int SHOW_ALL_TEHEPHONE_NUMBER = 2;
    private static final int SEARCH_TELEPHONW_NUMBER = 3;

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startProgram() {
        outputView.startProgram();
        workSelectedNumber(inputView.selectNumber());
    }

    public void workSelectedNumber(int inputNumber) {
        if(inputNumber == INPUT_TELEPHONE_NUMBER) {
            inputTelephoneNumber();
        }

        if(inputNumber == SHOW_ALL_TEHEPHONE_NUMBER) {
            showTelephoneNumber();
        }

        if(inputNumber == SEARCH_TELEPHONW_NUMBER) {

        }
    }

    public void inputTelephoneNumber() {
        inputView.inputTelephoneNumber();
        
    }

    public void showTelephoneNumber() {
        // outputView.printInputTelephoneNumber();
    }
}
