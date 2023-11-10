import React from 'react';

const CartItem = ({ item }) => {
    return (
        <div className="cart-item">
            <p>{item.name}</p>
            <p>Quantity: {item.quantity}</p>
            <p>Price: ${item.price.toFixed(2)}</p>
        </div>
    );
};

export default CartItem;
