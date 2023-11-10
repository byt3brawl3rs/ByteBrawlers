package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.Image;

import java.util.List;

public interface ImageService {

    public List<Image> getAllImages(Integer itemId);

    public Image getImage(Integer id);

    public void createImage(Image image);

    public void updateImage(Image image);

    public void deleteImage(Integer id);


}
