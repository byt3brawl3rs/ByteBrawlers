package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.DTO.ItemImageDTO;
import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;
import com.ByteBrawlers.ByteBrawlers.Service.ItemImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/itemImage")
@CrossOrigin
public class ItemImageController {

    @Autowired
    ItemImageService itemImageService;

    public ItemImageController(ItemImageService itemImageService) {
        this.itemImageService = itemImageService;
    }

    @GetMapping("{imageId}")
    public ResponseEntity<ItemImageDTO> getItemImage(@PathVariable("imageId") Integer imageId) {
        ItemImageDTO itemImageDTO = itemImageService.getItemImage(imageId);
        return ResponseEntity.status(HttpStatus.OK).body(itemImageDTO);
    }

    @GetMapping
    public List<ItemImage> getItemImages() {
        return itemImageService.getAllItemImages();
    }

    @PostMapping
    public String createItemImage(@RequestBody ItemImage itemImage) {
        this.itemImageService.createItemImage(itemImage);
        return "Creating item image";
    }

}
