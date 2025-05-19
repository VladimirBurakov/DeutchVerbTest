package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.setTitle("DeutschVerbTest");
        primaryStage.setScene(new Scene(root));
        //primaryStage.setScene(new Scene(root, 800, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
