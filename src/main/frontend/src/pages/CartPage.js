// CartPage.js
import React, { Component } from 'react';
import Header from '../Components/General/Navigation/Header';
import CartItem from '../Components/Cart/CartItem';
import '../FrontEnd/CSS/cart-style.css'; // Import the cart styles

class CartPage extends Component {
    state = {
        cartItems: [
            {
                id: 1,
                name: 'Stylish Shirt',
                price: 29.99,
                quantity: 2,
            },
            {
                id: 2,
                name: 'Comfortable Jeans',
                price: 49.99,
                quantity: 1,
            },
            // Add more items as needed
        ],
    };

    calculateTotal = () => {
        return this.state.cartItems.reduce((total, item) => total + item.price * item.quantity, 0).toFixed(2);
    };

    render() {
        const { cartItems } = this.state;

        return (
            <div className="CartPage">
                <Header />
                <div className="cart-container">
                    <h2>Your Shopping Cart</h2>
                    {cartItems.length === 0 ? (
                        <p>Your cart is empty.</p>
                    ) : (
                        <div>
                            {cartItems.map((item) => (
                                <CartItem key={item.id} item={item} />
                            ))}
                            <div className="cart-total">
                                <p>Total: ${this.calculateTotal()}</p>
                            </div>
                            <button className="checkout-button">Proceed to Checkout</button>
                        </div>
                    )}
                </div>
            </div>
        );
    }
}

export default CartPage;
