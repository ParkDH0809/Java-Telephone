package telephone.controller;

import java.io.IOException;

import telephone.view.InputView;
import telephone.view.OutputView;

public class Controller {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startProgram() {
        String number = null;
        outputView.startProgram();
        
        try {
            number = inputView.inputTelephoneNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        outputView.printInputTelephoneNumber(number);
    }
}
