package com.swlc.social_media.controller;

import com.swlc.social_media.model.PostModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class OwnChannelController {

    public ImageView userImageView;
    public Label userNameLabel;
    public Button createPostButton;
    @FXML
    private VBox postContainer;
    PostModel postModel = new PostModel();
    @FXML
    public void initialize() {}


    public void CreatePostOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/postPublish.fxml"));
            Parent popupContent = fxmlLoader.load();

            PostPublishController postPublishController = fxmlLoader.getController();

            Stage popupStage = new Stage();
            popupStage.setScene(new Scene(popupContent));
            popupStage.initModality(Modality.APPLICATION_MODAL);
            popupStage.setTitle("Create Post");
            popupStage.setWidth(600);
            popupStage.setHeight(450);

            PostPublishController.createPostStage = popupStage;

            popupStage.showAndWait();

//            if (createPostController.isPostCreated()) {
//                showAllPosts();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
