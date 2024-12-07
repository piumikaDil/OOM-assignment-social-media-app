package com.swlc.social_media.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginControllerTest extends ApplicationTest {

    private UserLoginController controller;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userLogin.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        controller.setPrimaryStage(stage);

        stage.setScene(new Scene(root));
        stage.show();
    }

    @BeforeEach
    void setup() {
        TextField channelNameField = lookup("#channelNameField").query();
        TextField passwordField = lookup("#passwordField").query();

        channelNameField.setText("");
        passwordField.setText("");
    }

    @Test
    void testLoginNavigation() {
        clickOn("#channelNameField").write("TestChannel");
        clickOn("#passwordField").write("password123");

        clickOn("#loginButton");

        assertNotNull(controller.primaryStage.getScene());
        assertTrue(controller.primaryStage.getScene().getRoot().toString().contains("mainPanel"));
    }

    @Test
    void testRegisterNavigation() {
        clickOn("#registerButton");

        assertNotNull(controller.loginPane.getChildren());
        assertTrue(controller.loginPane.getChildren().toString().contains("registerPane"));
    }
}
