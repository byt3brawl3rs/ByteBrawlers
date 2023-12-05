// CartItem.js
import React from 'react';

const CartItem = ({item, onDelete, onChange}) => {
    const handleQuantityChange = (value) => {
        const newQuantity = item.quantity + value;

        // Ensure the quantity doesn't go below 1
        if (newQuantity >= 1) {
            onChange('quantity', newQuantity);
        }
    };

    const handleSizeChange = (event) => {
        onChange('size', event.target.value);
    };

    return (
        <div className="cart-item">
            <p>{item.title}</p>
            <div className="item-details">
                <label>
                    Quantity:
                    <div className="quantity-container">
                        <button
                            className="quantity-button minus-button"
                            onClick={() => handleQuantityChange(-1)}
                        >
                            -
                        </button>
                        <span className="quantity-display">{item.quantity}</span>
                        <button
                            className="quantity-button plus-button"
                            onClick={() => handleQuantityChange(1)}
                        >
                            +
                        </button>
                    </div>
                </label>
                <label>
                    Size:
                    <select value={item.size} onChange={handleSizeChange}>
                        <option value="S">S</option>
                        <option value="M">M</option>
                        <option value="L">L</option>
                    </select>
                </label>
            </div>
            <p>Price: ${item.price.toFixed(2)}</p>
            <button className="remove-button" onClick={onDelete}>
                Remove
            </button>
        </div>
    );
};

export default CartItem;
