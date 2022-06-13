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

public class Controller {
    @FXML
    private TextField zweiFormTextId;

    @FXML
    private TextField präteritumTextId;

    @FXML
    private TextField partizipIITextId;

    @FXML
    private TextField übersetzungTextId;

    @FXML
    private Label zweiFormAntwortId;

    @FXML
    private Label präteritumAntwortId;

    @FXML
    private Label partizipIIAntwortId;

    @FXML
    private Label übersetzungAntwortId;

    @FXML
    private Label wortLabelId;

    @FXML
    private Label zweiFormRightLabelId;

    @FXML
    private Label präteritumRightLabelId;

    @FXML
    private Label partizipIIRightLabelId;

    @FXML
    private Label übersetzungRightLabelId;

    @FXML
    private Label resultILabelId;

    String[][]dictionary;

    private void getRow(){
        String[] row = dictionary[(int)(dictionary.length * Math.random())];
        wortLabelId.setText(row[0]);
    };

    @FXML
    void initialize() {
        dictionary = new DictionaryDeutsch().getDictionary();
        getRow();
    }

    @FXML
    void CheckButtonOnAction(ActionEvent event) {

    }

    @FXML
    void NextButtonOnAction(ActionEvent event) {
        getRow();
    }

    @FXML
    void FinishTestButtonOnAction(ActionEvent event) {
        resultILabelId.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Controller.class.getResource("result.fxml"));
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
        stage.setMinWidth(250);
        stage.show();
    }
}

