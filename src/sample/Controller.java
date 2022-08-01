package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
    private Label präteritumRightLablelId;

    @FXML
    private Label partizipIIRightLabelId;

    @FXML
    private Label übersetzungRightLabelId;

    @FXML
    private Label übersetzungLabelId;

    @FXML
    private Label resultLabelId;

    @FXML
    private Label resultAusLabelId;

    @FXML
    private Button checkButtonId;

    @FXML
    private Button nextButtonId;

    private String[][]dictionary;
    private String[]row;
    private int countAll = 0;
    private int countResult = 0;
    private boolean flag;

    private void getRow(){
        row = dictionary[(int)(dictionary.length * Math.random())];
        wortLabelId.setText(row[0]);
        übersetzungLabelId.setText(row[row.length -1]);
    };
    private void setEmptyText(){

        zweiFormAntwortId.setText("");
        zweiFormRightLabelId.setText("");

        präteritumAntwortId.setText("");
        präteritumRightLablelId.setText("");

        partizipIIAntwortId.setText("");
        partizipIIRightLabelId.setText("");

        übersetzungAntwortId.setText("");
        übersetzungRightLabelId.setText("");
    }
    private void clearAllText(){
        setEmptyText();
        zweiFormTextId.setText("");
        präteritumTextId.setText("");
        partizipIITextId.setText("");
    }
    private void setDefaultTextColor(){
        zweiFormTextId.setStyle("-fx-text-fill: black");
        präteritumTextId.setStyle("-fx-text-fill: black");
        partizipIITextId.setStyle("-fx-text-fill: black");
    }

    @FXML
    void initialize() {
        dictionary = new DictionaryDeutsch().getDictionary();
        getRow();
        setEmptyText();
    }

    @FXML
    void checkButtonOnAction(ActionEvent event) {
        if(flag){
            //checkButtonId.isDisable();
        }else if(zweiFormTextId.getText().isEmpty() ||
                präteritumTextId.getText().isEmpty() || partizipIITextId.getText().isEmpty()){
        } else{
            flag = true;
            int temp = 0;
            if(zweiFormTextId.getText().equals(row[1])){
                zweiFormTextId.setStyle("-fx-text-fill: green");
                zweiFormAntwortId.setText("Верно");
                temp++;
            }else{
                zweiFormTextId.setStyle("-fx-text-fill: red");
                zweiFormAntwortId.setText("Неверно!!!");
            }
            zweiFormRightLabelId.setText(row[1]);

            if(präteritumTextId.getText().equals(row[2])){
                präteritumTextId.setStyle("-fx-text-fill: green");
                präteritumAntwortId.setText("Верно");
                temp++;
            }else{
                präteritumTextId.setStyle("-fx-text-fill: red");
                präteritumAntwortId.setText("Неверно!!!");
            }
            präteritumRightLablelId.setText(row[2]);

            if(partizipIITextId.getText().equals(row[3])){
                partizipIITextId.setStyle("-fx-text-fill: green");
                partizipIIAntwortId.setText("Верно");
                temp++;
            }else{
                partizipIITextId.setStyle("-fx-text-fill: red");
                partizipIIAntwortId.setText("Неверно!!!");
            }
            partizipIIRightLabelId.setText(row[3]);

            if(temp == 3){
                countResult++;
            }
            countAll++;
            resultLabelId.setText(String.valueOf(countResult));
            resultAusLabelId.setText(String.valueOf(countAll));
        }

    }

    @FXML
    void enterZweiFormText(KeyEvent event) {
        KeyCode key = event.getCode();
        if(key == KeyCode.ENTER){
            präteritumTextId.requestFocus();
        }
    }

    @FXML
    void enterPrateritumText(KeyEvent event) {
        KeyCode key = event.getCode();
        if(key == KeyCode.ENTER){
            partizipIITextId.requestFocus();
        }
    }

    @FXML
    void enterPartizipText(KeyEvent event) {
        KeyCode key = event.getCode();
        if(key == KeyCode.ENTER){
            checkButtonId.requestFocus();
        }
    }

    @FXML
    void enterCheckButton(KeyEvent event) {
        KeyCode key = event.getCode();
        if(key == KeyCode.ENTER){
            checkButtonId.fire();
            nextButtonId.requestFocus();
        }
    }

    @FXML
    void enterNextButton(KeyEvent event) {
        KeyCode key = event.getCode();
        if(key == KeyCode.ENTER){
            nextButtonId.fire();
            zweiFormTextId.requestFocus();
        }
    }

    @FXML
    void nextButtonOnAction(ActionEvent event) {
        if(zweiFormTextId.getText().isEmpty() ||
                präteritumTextId.getText().isEmpty() || partizipIITextId.getText().isEmpty()){
            setEmptyText();
        }else{
            flag = false;
            clearAllText();
            setDefaultTextColor();
            getRow();
        }

    }

    @FXML
    void finishTestButtonOnAction(ActionEvent event) {
        ResultClass.setResult(countResult);
        ResultClass.setAmount(countAll);
        resultLabelId.getScene().getWindow().hide();
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

