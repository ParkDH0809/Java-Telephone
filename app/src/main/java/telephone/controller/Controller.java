package telephone.controller;

import telephone.model.Telephone;
import telephone.model.Telephones;
import telephone.service.TelephoneSearchService;
import telephone.view.InputView;
import telephone.view.OutputView;

public class Controller {
    private static final int PROGRAM_END_NUMBER = 0;
    private static final int INPUT_TELEPHONE_NUMBER = 1;
    private static final int SHOW_ALL_TEHEPHONE_NUMBER = 2;
    private static final int SEARCH_TELEPHONE_NUMBER = 3;

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    TelephoneSearchService telephoneSearchService = new TelephoneSearchService();
    public void startProgram() {
        Telephones telephones =  new Telephones();
        outputView.startProgram();

        while(true) {
            if(workSelectedNumber(inputView.selectNumber(), telephones) == 0) {
                break;
            }
        }
    }

    public int workSelectedNumber(int inputNumber, Telephones telehones) {
        if(inputNumber == PROGRAM_END_NUMBER) {
            endProgram();
        }

        if(inputNumber == INPUT_TELEPHONE_NUMBER) {
            inputTelephoneInfo(telehones);
        }

        if(inputNumber == SHOW_ALL_TEHEPHONE_NUMBER) {
            showTelephoneNumber(telehones);
        }

        if(inputNumber == SEARCH_TELEPHONE_NUMBER) {
            searchTelephoneInfo(telehones);
        }

        return inputNumber;
    }

    public void endProgram() {
        outputView.endProgram();
    }

    public void inputTelephoneInfo(Telephones telephones) {
        telephones.addTelephone(new Telephone(inputView.inputName(), inputView.inputTelephoneNumber()));
        outputView.printInputInfoCompleted();
    }

    public void showTelephoneNumber(Telephones telephones) {
        for(Telephone telephone : telephones.getTelephones()) {
            outputView.printInputTelephoneNumber(telephone);
        }
    }

    public void searchTelephoneInfo(Telephones telephones) {
        String searchString = inputView.inputSearchString();
        outputView.printTelephoneSearchResult(telephoneSearchService.searchTelephones(telephones, searchString));
    }
}
