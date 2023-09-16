package telephone.controller;

import java.io.IOException;

import telephone.view.InputView;
import telephone.view.OutputView;

public class Controller {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startProgram() {
        outputView.startProgram();
        
        try {
            inputView.inputTelephoneNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
