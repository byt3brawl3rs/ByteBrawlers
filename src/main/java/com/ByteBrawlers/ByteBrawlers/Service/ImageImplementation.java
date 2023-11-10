package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.Image;
import com.ByteBrawlers.ByteBrawlers.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageImplementation implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public ImageImplementation(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<Image> getAllImages(Integer itemId) {
        return imageRepository.findByItemId(itemId);
    }

    @Override
    public Image getImage(Integer id) {
        return imageRepository.findById(id).get();
    }

    @Override
    public void createImage(Image image) {
        imageRepository.save(image);
    }

    @Override
    public void updateImage(Image image) {
        imageRepository.save(image);
    }

    @Override
    public void deleteImage(Integer id) {
        imageRepository.deleteById(id);
    }
}
