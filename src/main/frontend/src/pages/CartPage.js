// CartPage.js
import React, {Component} from 'react';
import {Link, useLocation} from "react-router-dom";
import Header from '../Components/General/Navigation/Header';
import CartItem from '../Components/Cart/CartItem';
import CheckoutButton from '../Components/Cart/CheckoutButton';
import '../Components/Cart/CSS/Cart.css'; // Import the cart styles

class CartPage extends Component {
    state = {
        cartItems: [
            {
                id: 1,
                name: 'Stylish Shirt',
                price: 29.99,
                quantity: 2,
                size: 'M',
            },
            {
                id: 2,
                name: 'Comfortable Jeans',
                price: 49.99,
                quantity: 1,
                size: 'L',
            },
            // Add more items as needed
        ],
        taxRate: 0.08, // Example tax rate (8%)
        shippingHandlingFee: 15.0, // Combined shipping and handling fee
    };

    calculateSubtotal = () => {
        return this.state.cartItems.reduce((total, item) => total + item.price * item.quantity, 0);
    };

    calculateTax = () => {
        return this.calculateSubtotal() * this.state.taxRate;
    };

    calculateTotal = () => {
        const subtotal = this.calculateSubtotal();
        const tax = this.calculateTax();
        const shippingHandling = this.state.shippingHandlingFee;

        return (subtotal + tax + shippingHandling).toFixed(2);
    };

    handleDeleteItem = (itemId) => {
        const updatedCart = this.state.cartItems.filter((item) => item.id !== itemId);
        this.setState({cartItems: updatedCart});
    };

    handleChangeItem = (itemId, property, value) => {
        const updatedCart = this.state.cartItems.map((item) =>
            item.id === itemId ? {...item, [property]: value} : item
        );
        this.setState({cartItems: updatedCart});
    };

    render() {
        const {cartItems} = this.state;

        return (
            <div className="CartPage">
                <Header/>
                <div className="cart-container">
                    <h2>Your Shopping Cart</h2>
                    {cartItems.length === 0 ? (
                        <p>Your cart is empty.</p>
                    ) : (
                        <div>
                            {cartItems.map((item) => (
                                <CartItem
                                    key={item.id}
                                    item={item}
                                    onDelete={() => this.handleDeleteItem(item.id)}
                                    onChange={(property, value) =>
                                        this.handleChangeItem(item.id, property, value)
                                    }
                                />
                            ))}
                            <div className="cart-buttons">
                                <Link to="/">
                                    <button className="back-to-shopping">
                                        Back to Shopping
                                    </button>
                                </Link>
                                <CheckoutButton total={this.calculateTotal()}/>
                            </div>
                        </div>
                    )}
                </div>
                <div className="cart-summary">
                    <div className="subtotal">
                        <p>Subtotal: ${this.calculateSubtotal().toFixed(2)}</p>
                    </div>
                    <div className="taxes">
                        <p>Taxes: ${this.calculateTax().toFixed(2)}</p>
                    </div>
                    <div className="shipping-handling">
                        <p>Shipping & Handling: ${this.state.shippingHandlingFee.toFixed(2)}</p>
                    </div>
                    <div className="total">
                        <p>Total: ${this.calculateTotal()}</p>
                    </div>
                </div>
            </div>
        );
    }
}

export default CartPage;
