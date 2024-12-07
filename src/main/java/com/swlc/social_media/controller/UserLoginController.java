package com.swlc.social_media.controller;

import com.swlc.social_media.dto.ChannelDTO;
import com.swlc.social_media.entity.ChannelEntity;
import com.swlc.social_media.model.ChannelModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.modelmapper.ModelMapper;

import java.io.IOException;

public class UserLoginController {

    public TextField channelNameField;
    public AnchorPane loginPane;
    @FXML
    private TextField passwordField;
    public static Stage primaryStage;
    static ChannelEntity loggedChannel;

    static ModelMapper mapper = new ModelMapper();
    public static ChannelDTO getLoggedChannel() {
        return mapper.map(loggedChannel,ChannelDTO.class);
    }
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    ChannelModel channelModel = new ChannelModel();

    public void onClickBtnLogin(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/homePage.fxml"));
            primaryStage.setScene(new Scene(root, 850, 550));
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnNavigateRegisterOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userRegister.fxml"));
            Pane registerPane = loader.load();

            loginPane.getChildren().clear();
            loginPane.getChildren().add(registerPane);

//            AnchorPane.setTopAnchor(registerPane, 0.0);
//            AnchorPane.setBottomAnchor(registerPane, 0.0);
//            AnchorPane.setLeftAnchor(registerPane, 0.0);
//            AnchorPane.setRightAnchor(registerPane, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
