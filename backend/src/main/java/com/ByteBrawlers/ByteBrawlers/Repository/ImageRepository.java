package com.ByteBrawlers.ByteBrawlers.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    public List<Image> findByItemId(Integer itemId);
}
