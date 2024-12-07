package com.swlc.social_media;

import com.swlc.social_media.controller.UserLoginController;
import com.swlc.social_media.controller.UserRegisterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userLogin.fxml"));
        AnchorPane root = loader.load();
        UserRegisterController.primaryStage = primaryStage;
        UserLoginController.primaryStage = primaryStage;
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
}


    public static void main(String[] args) {
        launch(args);
    }
}


