package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.Cart;
import com.ByteBrawlers.ByteBrawlers.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartImplementation implements CartService {
    @Autowired
    private CartRepository cartRepository;

    public CartImplementation(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public void createCart(Cart cart) {

    }
}
