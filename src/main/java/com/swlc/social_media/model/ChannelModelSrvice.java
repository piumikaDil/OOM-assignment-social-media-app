package com.swlc.social_media.model;

import com.swlc.social_media.dto.ChannelDTO;
import com.swlc.social_media.dto.ResponseDTO;
import com.swlc.social_media.entity.ChannelEntity;

import java.io.File;
import java.util.List;

public interface ChannelModelSrvice {
    ChannelEntity login(String channel_name, String password);

    ResponseDTO updateProfilePicture(Long channelId, File propic);

    void subscribeChannel(ChannelDTO subscriberChannel, ChannelDTO channelToSubscribe);

    void unSubscribeChannel(ChannelDTO subscriberChannel, ChannelDTO channelToUnsubscribe);

    List<ChannelDTO> getAllChannel();

    ChannelDTO getSubscribedChannelsByChannelId(Long channelId);

    ChannelDTO registerChannel(ChannelDTO channel, File selected_file);
}
