package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.DTO.ItemImageDTO;
import com.ByteBrawlers.ByteBrawlers.Model.ItemImage;
import com.ByteBrawlers.ByteBrawlers.Repository.CustomerRepository;
import com.ByteBrawlers.ByteBrawlers.Repository.ItemImageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ItemImageServiceImplementation implements ItemImageService {

    private final RestTemplate restTemplate;

    @Autowired
    ItemImageRepository itemImageRepository;
    @Autowired
    private ModelMapper mapper;

    public ItemImageServiceImplementation(@Value("http://localhost:8080/itemImage") String itemImageBaseURL, RestTemplateBuilder builder,
                                          CustomerRepository customerRepository) {
        this.itemImageRepository = itemImageRepository;
        this.restTemplate = builder.rootUri(itemImageBaseURL).build();
    }

    @Override
    public String createItemImage(ItemImage itemImage) {
        itemImageRepository.save(itemImage);
        return "Creating image for item";
    }

    @Override
    public String updateItemImage(ItemImage itemImage) {
        itemImageRepository.save(itemImage);
        return "Updating image for item";
    }

    @Override
    public String deleteItemImage(Integer imageId) {
        //if (getItemImage(imageId) == null) {
        //     new ItemImageNotFoundException(imageId);
        // }
        itemImageRepository.deleteById(imageId);
        return "Deleting image for item";
    }

    @Override
    public ItemImageDTO getItemImage(Integer imageId) {
        Optional<ItemImage> itemImage = itemImageRepository.findById(imageId);
        return mapper.map(itemImage, ItemImageDTO.class);
    }

    @Override
    public List<ItemImage> getAllItemImages() {
        return null;
    }
}
