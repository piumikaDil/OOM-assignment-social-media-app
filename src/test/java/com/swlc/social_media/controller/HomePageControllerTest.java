package com.swlc.social_media.controller;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HomePageControllerTest extends ApplicationTest {

    private HomePageController controller;
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        // Initialize JavaFX components for the test
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/homePage.fxml"));
        AnchorPane root = loader.load();
        controller = loader.getController();
        controller.dynamicPane = new AnchorPane(); // Mock dynamicPane
        controller.mainPanel = root;
        this.stage = stage;

        stage.setScene(new Scene(root));
        stage.show();
    }

    @BeforeEach
    void setUp() {
        controller.dynamicPane.getChildren().clear(); // Ensure a clean state before each test
    }

    @Test
    void testBtnHomeOnAction() throws Exception {
        FxRobot robot = new FxRobot();
        clickOn("#btnNewsFeed1"); // Trigger the button action
        robot.sleep(500); // Allow time for the action

        assertNotNull(controller.dynamicPane.getChildren(),
                "Dynamic pane should not be null after loading FXML");
        assertTrue(controller.dynamicPane.getChildren().toString().contains("dynamicPane"));
    }
}
