package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ExitController {

    @FXML
    private Label resultILabelId;

    @FXML
    void ExitButtonOnAction(ActionEvent event) {
        resultILabelId.getScene().getWindow().hide();
    }

    @FXML
    void StartButtonOnAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ExitController.class.getResource("sample.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setMinHeight(150);
        stage.setMinWidth(300);
        stage.show();
    }
}

