package telephone.controller;

import telephone.model.TelePhone;
import telephone.model.TelePhones;
import telephone.view.InputView;
import telephone.view.OutputView;

public class Controller {
    private static final int PROGRAM_END_NUMBER = 0;
    private static final int INPUT_TELEPHONE_NUMBER = 1;
    private static final int SHOW_ALL_TEHEPHONE_NUMBER = 2;
    private static final int SEARCH_TELEPHONE_NUMBER = 3;

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startProgram() {
        outputView.startProgram();

        while(true) {
            if(workSelectedNumber(inputView.selectNumber()) == 0) {
                break;
            }
        }
    }

    public int workSelectedNumber(int inputNumber) {
        if(inputNumber == PROGRAM_END_NUMBER) {
            endProgram();
        }

        if(inputNumber == INPUT_TELEPHONE_NUMBER) {
            inputTelephoneInfo();
        }

        if(inputNumber == SHOW_ALL_TEHEPHONE_NUMBER) {
            showTelephoneNumber();
        }

        if(inputNumber == SEARCH_TELEPHONE_NUMBER) {

        }

        return inputNumber;
    }

    public void endProgram() {
        outputView.endProgram();
    }

    public void inputTelephoneInfo() {
        TelePhones telephones = new TelePhones();
        telephones.addTelephone(new TelePhone(inputView.inputName(), inputView.inputTelephoneNumber()));
    }

    public void showTelephoneNumber() {
        TelePhones telePhones = new TelePhones();
        for(TelePhone telephone : telePhones.getTelePhones()) {
            outputView.printInputTelephoneNumber(telephone);
        }
        
    }
}
