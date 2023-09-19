package telephone.controller;

import java.io.IOException;

import telephone.view.InputView;
import telephone.view.OutputView;

public class Controller {
    private static final int INPUT_TELEPHONE_NUMBER = 1;
    private static final int SHOW_ALL_TEHEPHONE_NUMBER = 2;
    private static final int SEARCH_TELEPHONW_NUMBER = 3;

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startProgram() {
        int inputNumber = 0;
        outputView.startProgram();
        
        try {
            inputNumber = inputView.selectNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }

        workSelectedNumber(inputNumber);

    }

    public void workSelectedNumber(int inputNumber) {
        if(inputNumber == INPUT_TELEPHONE_NUMBER) {

        }

        if(inputNumber == SHOW_ALL_TEHEPHONE_NUMBER) {
            showTelephoneNumber();
        }

        if(inputNumber == SEARCH_TELEPHONW_NUMBER) {

        }
    }

    public void showTelephoneNumber() {
        // outputView.printInputTelephoneNumber();
    }
}
