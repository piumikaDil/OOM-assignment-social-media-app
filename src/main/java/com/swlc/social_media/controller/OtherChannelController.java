package com.swlc.social_media.controller;

import com.swlc.social_media.model.ChannelModel;
import com.swlc.social_media.model.PostModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class OtherChannelController {
    public ImageView userImageView;
    public Label userNameLabel;
    public Button subOrUnSubButton;
    @FXML
    private VBox postContainer;  // Reference to the VBox in the FXML file
    private static Long otherChannelId;
    PostModel postModel = new PostModel();
    ChannelModel channelModel = new ChannelModel();

    @FXML
    public void initialize() {
    }

    public void setOtherChannelId(Long channel_id) {
        otherChannelId = channel_id;
    }

}
