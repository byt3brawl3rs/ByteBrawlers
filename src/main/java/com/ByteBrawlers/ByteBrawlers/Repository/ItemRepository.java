package com.ByteBrawlers.ByteBrawlers.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findAllByColorId(Integer colorId);

    List<Item> findAllBySizeId(Integer sizeId);

    List<Item> findAllByTypeId(Integer typeId);

    List<Item> findAllByFormFactorId(Integer formFactorId);

    List<Item> findAllByColorIdAndSizeId(Integer colorId, Integer sizeId);

    List<Item> findAllByColorIdAndSizeIdAndTypeId(Integer colorId, Integer sizeId, Integer typeId);

    List<Item> findAllByColorIdAndSizeIdAndTypeIdAndFormFactorId(Integer colorId, Integer sizeId, Integer typeId, Integer formFactorId);

    @Query("SELECT i FROM Item i WHERE MOD(i.id, 2) = 0")
    List<Item> findAllByEvenItemId();

    @Query("SELECT i FROM Item i WHERE i.price < 20")
    List<Item> findAllByPriceLower20();

    @Query("SELECT i FROM Item i ORDER BY i.id DESC LIMIT 5")
    List<Item> findFiveRandomItems();

    @Query("SELECT i FROM Item i WHERE i.title LIKE \"%?1%\"")
    List<Item> findAllBySearchParameter(String searchParam);
}
