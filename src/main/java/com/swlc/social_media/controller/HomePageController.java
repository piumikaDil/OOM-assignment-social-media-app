package com.swlc.social_media.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    public AnchorPane dynamicPane;
    public AnchorPane mainPanel;
    public Label channelName;
    public ImageView cameraView;
    public ImageView propic;
    public AnchorPane sidePanel;
    public Button btnNewsFeed;
    public Button btnLogout;
    public Button btnChannel;
    @FXML
    private VBox postContainer;

    @FXML
    public void initialize() {}

    public void btnHomeOnAction(ActionEvent actionEvent) {
        try {
            setButtonSelected(btnNewsFeed);
            // Load the FXML for the channel page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/home_duplicate.fxml"));
            Pane channelPane = loader.load();

            dynamicPane.getChildren().clear();
            dynamicPane.getChildren().add(channelPane);

            AnchorPane.setTopAnchor(channelPane, 0.0);
            AnchorPane.setBottomAnchor(channelPane, 0.0);
            AnchorPane.setLeftAnchor(channelPane, 0.0);
            AnchorPane.setRightAnchor(channelPane, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnChannelOnAction(ActionEvent actionEvent) {
        try {
            setButtonSelected(btnChannel);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/subscriber.fxml"));
            Pane channelPane = loader.load();

            dynamicPane.getChildren().clear();
            dynamicPane.getChildren().add(channelPane);

            AnchorPane.setTopAnchor(channelPane, 0.0);
            AnchorPane.setBottomAnchor(channelPane, 0.0);
            AnchorPane.setLeftAnchor(channelPane, 0.0);
            AnchorPane.setRightAnchor(channelPane, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleImageClick(MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ownChannel.fxml"));
            Pane channelPane = loader.load();

            dynamicPane.getChildren().clear();
            dynamicPane.getChildren().add(channelPane);

            AnchorPane.setTopAnchor(channelPane, 0.0);
            AnchorPane.setBottomAnchor(channelPane, 0.0);
            AnchorPane.setLeftAnchor(channelPane, 0.0);
            AnchorPane.setRightAnchor(channelPane, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) {
        try {
            setButtonSelected(btnLogout);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userLogin.fxml"));
            AnchorPane loginPane = loader.load();

            Stage currentStage = (Stage) mainPanel.getScene().getWindow();

            currentStage.setScene(new Scene(loginPane));
            currentStage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setButtonSelected(Button selectedButton) {
        btnNewsFeed.getStyleClass().remove("custom-button-selected");
        btnChannel.getStyleClass().remove("custom-button-selected");
        btnLogout.getStyleClass().remove("custom-button-selected");
        selectedButton.getStyleClass().add("custom-button-selected");
    }
}
