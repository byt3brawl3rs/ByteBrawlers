// CheckoutButton.js
import React from 'react';

const CheckoutButton = ({ total }) => {
    const handleCheckout = () => {
        // Implement your checkout logic here
        console.log('Proceeding to checkout with total:', total);
    };

    return (
        <div className="checkout-button-container">
            <button className="checkout-button" onClick={handleCheckout}>
                Proceed to Checkout
            </button>
        </div>
    );
};

export default CheckoutButton;
