package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    double x,y = 0;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/loginPage.fxml")) ;
      // primaryStage.setTitle("Transport Management System");

        /* primaryStage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(event -> {

            x = event.getScreenX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });*/

        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
