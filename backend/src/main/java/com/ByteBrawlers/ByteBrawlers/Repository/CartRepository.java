package com.ByteBrawlers.ByteBrawlers.Repository;

import com.ByteBrawlers.ByteBrawlers.Model.Cart;
import com.ByteBrawlers.ByteBrawlers.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
