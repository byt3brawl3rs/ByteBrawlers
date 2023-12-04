// CartPage.js
import React, {Component} from 'react';
import {Link} from "react-router-dom";
import Header from '../Components/General/Navigation/Header';
import CartItem from '../Components/Cart/CartItem';
import CheckoutButton from '../Components/Cart/CheckoutButton';
import '../Components/Cart/CSS/cart-style.css';
import cartItem from "../Components/Cart/CartItem"; // Import the cart styles

class CartPage extends Component {
    state = {
        cartItems: JSON.parse(localStorage.getItem("cart")),
        taxRate: 0.08, // Example tax rate (8%)
        shippingHandlingFee: 15.0, // Combined shipping and handling fee
        nothingShipping: 0.0,
    };
    calculateSubtotal = () => {
        let total = 0.0;
        for (let key in this.state.cartItems) {
            total += this.state.cartItems[key].price
            console.log(this.state.cartItems[key])
            console.log(total)
        }
        return total;
    };

    countProperties(obj) {
        var count = 0;

        for (var prop in obj) {
            if (obj.hasOwnProperty(prop))
                ++count;
        }

        return count;
    }

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
        const stage = 'Cart'; // Set the current stage

        // Group the items into pairs
        const itemsInPairs = [];
        let pair = [];
        let i = 0
        console.log(cartItems)
        for (let key in cartItems) {
            i++
            console.log(cartItems[key])
            pair.push(cartItems[key]);
            if (i % 2 === 0) {
                itemsInPairs.push(pair);
                pair = [];
            }
        }
        const size = this.countProperties(cartItems)
        if (size % 2 === 1 && i === size) {
            itemsInPairs.push(pair);
        }

        return (
            <div className="CartPage">
                <Header/>
                {/* New section for the checkout stage */}
                <div className="checkout-stage">
                    <p className={stage === 'Cart' ? 'active' : 'inactive'}>Cart</p>
                    <p className={stage === 'Checkout' ? 'active' : 'inactive'}>Checkout</p>
                    <p className={stage === 'Payment' ? 'active' : 'inactive'}>Payment</p>
                    <p className={stage === 'OrderComplete' ? 'active' : 'inactive'}>Order Complete</p>
                </div>
                <div className="cart-summary2">
                    <div className="subtotal">
                        <p>Subtotal: ${this.calculateSubtotal().toFixed(2)}</p>
                    </div>
                    <div className="taxes">
                        <p>Taxes: ${this.calculateTax().toFixed(2)}</p>
                    </div>
                    <div className="shipping-handling">
                        {cartItems.length === 0 ? (
                                <p>Shipping & Handling: ${this.state.nothingShipping.toFixed(2)}</p>) :
                            (<p>Shipping & Handling: ${this.state.shippingHandlingFee.toFixed(2)}</p>)}
                    </div>
                    <div className="total">
                        {cartItems.length === 0 ? (<p>Total: ${this.state.nothingShipping.toFixed(2)}</p>) :
                            (<p>Total: ${this.calculateTotal()}</p>)}

                    </div>
                </div>
                <div className="cart-container">
                    <h2>Your Shopping Cart</h2>
                    {cartItems.length === 0 ? (
                        <p>Your cart is empty.</p>
                    ) : (
                        <div>
                            {itemsInPairs.map((pair, index) => (
                                <div key={index} className="cart-row">
                                    {pair.map((item) => (
                                        <CartItem
                                            key={item.id}
                                            item={item}
                                            onDelete={() => this.handleDeleteItem(item.id)}
                                            onChange={(property, value) =>
                                                this.handleChangeItem(item.id, property, value)
                                            }
                                        />
                                    ))}
                                </div>
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
                        {cartItems.length === 0 ? (
                                <p>Shipping & Handling: ${this.state.nothingShipping.toFixed(2)}</p>) :
                            (<p>Shipping & Handling: ${this.state.shippingHandlingFee.toFixed(2)}</p>)}
                    </div>
                    <div className="total">
                        {cartItems.length === 0 ? (<p>Total: ${this.state.nothingShipping.toFixed(2)}</p>) :
                            (<p>Total: ${this.calculateTotal()}</p>)}
                    </div>
                </div>
            </div>
        );
    }
}

export default CartPage;
