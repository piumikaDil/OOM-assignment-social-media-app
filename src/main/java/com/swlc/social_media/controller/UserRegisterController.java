package com.swlc.social_media.controller;

import com.swlc.social_media.model.ChannelModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class UserRegisterController {
    public ImageView propic;
    public ImageView cameraView;
    public TextField channelname;
    public TextField password;
    public AnchorPane registerPane;
    ChannelModel channelModel = new ChannelModel();
    public static Stage primaryStage;

    private File selectedFile = null;

    public void handleImageClick(MouseEvent mouseEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));
        fileChooser.setTitle("Select Profile Image");

        selectedFile = fileChooser.showOpenDialog(cameraView.getScene().getWindow());
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            propic.setImage(image);
        }
    }

    public void btnregisterOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userLogin.fxml"));
            Pane loginPane = loader.load();
            registerPane.getChildren().clear();
            registerPane.getChildren().add(loginPane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void btnNavigateLoginOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userLogin.fxml"));
            Pane loginPane = loader.load();

            UserLoginController userLoginController = loader.getController();
            userLoginController.setPrimaryStage(primaryStage); // Pass the primary stage

            registerPane.getChildren().clear();
            registerPane.getChildren().add(loginPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
