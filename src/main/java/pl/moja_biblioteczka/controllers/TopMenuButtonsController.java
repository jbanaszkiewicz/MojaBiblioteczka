package pl.moja_biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TopMenuButtonsController {

    private MainController mainController;
    @FXML
    public void openLibrary() {
        System.out.println("openLibrary");
    }

    public void openListBooks() {
        System.out.println("openListBooks");
    }

    public void openStatistics() {
        System.out.println("openStatistics");
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
