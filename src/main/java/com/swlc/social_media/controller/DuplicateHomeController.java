package com.swlc.social_media.controller;

import com.swlc.social_media.model.PostModel;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class DuplicateHomeController {
    public VBox postContainer;
    public AnchorPane dynamicPane;
    PostModel postModel = new PostModel();
    OtherChannelController otherChannelController = new OtherChannelController();

    @FXML
    public void initialize() {
    }
}
