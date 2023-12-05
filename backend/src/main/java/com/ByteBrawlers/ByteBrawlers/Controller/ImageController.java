package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.Model.Image;
import com.ByteBrawlers.ByteBrawlers.Model.Item;
import com.ByteBrawlers.ByteBrawlers.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/items/{itemId}/images")
@CrossOrigin
public class ImageController {

    @Autowired
    private ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping
    public List<Image> getAllImages(@PathVariable("itemId") Integer itemId) {
        return imageService.getAllImages(itemId);
    }

    @GetMapping("{id}")
    public Image getImage(@PathVariable("id") Integer id) {
        return imageService.getImage(id);
    }

    @PostMapping
    public void createImage(@PathVariable Integer itemId, @RequestBody Image image) {
        image.setItemId(itemId);
        imageService.createImage(image);
    }

    @PutMapping
    public void updateImage() {

    }

    @DeleteMapping
    public void deleteImage() {

    }

}
