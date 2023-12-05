// CheckoutButton.js
import React from 'react';
import { Link } from 'react-router-dom';

const CheckoutButton = ({ total }) => {
    const handleCheckout = () => {
        // Implement your checkout logic here
        console.log('Proceeding to checkout with total:', total);
    };

    return (
        <div className="checkout-button-container">
            <button className="checkout-button" onClick={handleCheckout}>
                <Link to="/checkout" className="checkout-button">
                    Proceed to Checkout
                </Link>
            </button>
        </div>
    );
};

export default CheckoutButton;
