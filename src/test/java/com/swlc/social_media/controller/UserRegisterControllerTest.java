package com.swlc.social_media.controller;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegisterControllerTest extends ApplicationTest {

    private UserRegisterController controller;
    private Stage testStage;

    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML and set the stage for testing
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/userRegister.fxml"));
        AnchorPane root = loader.load();
        controller = loader.getController();

        // Assign the primary stage for the controller
        UserRegisterController.primaryStage = stage;

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        this.testStage = stage;
    }


    @Test
    void testRegisterNavigation() {
        // Simulate clicking the register button
        clickOn("#regBtn");

        // Verify the registerPane now contains the loginPane
        assertNotNull(controller.registerPane.getChildren(), "registerPane children should not be null.");
        assertTrue(controller.registerPane.getChildren().toString().contains("loginPane"),
                "registerPane should contain the userLogin.fxml content.");
    }

    @Test
    void testNavigateToLogin() {
        // Simulate clicking the login navigation button
        clickOn("#navToLogin");

        // Verify the registerPane now contains the loginPane
        assertNotNull(controller.registerPane.getChildren(), "registerPane children should not be null.");
        assertTrue(controller.registerPane.getChildren().toString().contains("loginPane"),
                "registerPane should contain the userLogin.fxml content.");
    }
}

