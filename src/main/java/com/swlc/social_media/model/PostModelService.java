package com.swlc.social_media.model;

import com.swlc.social_media.dto.PostDTO;
import com.swlc.social_media.dto.ResponseDTO;

import java.io.File;
import java.util.List;

public interface PostModelService {
    ResponseDTO savePost(PostDTO postDTO, File selectedImage);
    List<PostDTO> getAllPost();
    List<PostDTO> getPostsByChannelId(Long channelId);
    String getNameByChannelId(Long channelId);
    String getProPicByChannelId(Long channelId);
}
