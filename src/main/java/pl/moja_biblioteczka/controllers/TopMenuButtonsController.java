package pl.moja_biblioteczka.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    private MainController mainController;
    @FXML
    private ToggleGroup toggleButtons;
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

    public void addBook(ActionEvent actionEvent) {
        if (toggleButtons.getSelectedToggle() != null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
    }

}
