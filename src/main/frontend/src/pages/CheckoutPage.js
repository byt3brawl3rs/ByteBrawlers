//import React, { Component } from "react";
import React, { useState } from "react";
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import "../Components/MainWebPage/CSS/CheckoutPage.css";
import { useLocation, Link } from "react-router-dom";

const CheckoutPage = () => {
    const location = useLocation();
    const { itemPrice, itemQuantity, itemSize } = location.state;
  
    const taxRate = 0.1; // 10%
    const shippingCost = 5;
  
    const [address, setAddress] = useState({
      line1: "",
      line2: "",
      city: "",
      state: "",
      zip: "",
    });
  
    const [paymentInfo, setPaymentInfo] = useState({
      cardNumber: "",
      expirationDate: "",
      nameOnCard: "",
      billingZip: "",
      cvv: "",
      useGiftCard: false,
    });
  
    const [shippingMethod, setShippingMethod] = useState("Standard");
  
    const subtotal = itemPrice * itemQuantity;
    const tax = subtotal * taxRate;
    const total = subtotal + tax + shippingCost;
  
    const handleAddressChange = (e, field) => {
      setAddress({ ...address, [field]: e.target.value });
    };
  
    const handlePaymentChange = (e, field) => {
      setPaymentInfo({ ...paymentInfo, [field]: e.target.value });
    };
  
    const handleSubmit = (e) => {
      e.preventDefault();
      const formData = { address, paymentInfo, shippingMethod };
      console.log(formData);
    };
  
    return (
      <div className="container">
        <h1>Checkout</h1>
  
        <div className="checkout-columns">
          <form onSubmit={handleSubmit} className="checkout-column">
            <h2>Address Information</h2>
            <label>
              Address Line 1:
              <input
                type="text"
                value={address.line1}
                onChange={(e) => handleAddressChange(e, "line1")}
              />
            </label>
            <label>
              Address Line 2:
              <input
                type="text"
                value={address.line2}
                onChange={(e) => handleAddressChange(e, "line2")}
              />
            </label>
            <label>
              City:
              <input
                type="text"
                value={address.city}
                onChange={(e) => handleAddressChange(e, "city")}
              />
            </label>
            <label>
              State:
              <input
                type="text"
                value={address.state}
                onChange={(e) => handleAddressChange(e, "state")}
              />
            </label>
            <label>
              Zip Code:
              <input
                type="text"
                value={address.zip}
                onChange={(e) => handleAddressChange(e, "zip")}
              />
            </label>
          </form>
  
          <form onSubmit={handleSubmit} className="checkout-column">
            <h2>Payment Information</h2>
            <label>
              Card Number:
              <input
                type="text"
                value={paymentInfo.cardNumber}
                onChange={(e) => handlePaymentChange(e, "cardNumber")}
              />
            </label>
            <label>
              Expiration Date:
              <input
                type="text"
                value={paymentInfo.expirationDate}
                onChange={(e) => handlePaymentChange(e, "expirationDate")}
              />
            </label>
            <label>
              Name on Card:
              <input
                type="text"
                value={paymentInfo.nameOnCard}
                onChange={(e) => handlePaymentChange(e, "nameOnCard")}
              />
            </label>
            <label>
              Billing Zip Code:
              <input
                type="text"
                value={paymentInfo.billingZip}
                onChange={(e) => handlePaymentChange(e, "billingZip")}
              />
            </label>
            <label>
              CVV:
              <input
                type="text"
                value={paymentInfo.cvv}
                onChange={(e) => handlePaymentChange(e, "cvv")}
              />
            </label>
            <label>
              Use Gift Card:
              <input
                type="checkbox"
                checked={paymentInfo.useGiftCard}
                onChange={(e) =>
                  setPaymentInfo({ ...paymentInfo, useGiftCard: e.target.checked })
                }
              />
            </label>
          </form>
  
          <form onSubmit={handleSubmit} className="checkout-column">
            <h2>Shipping Method</h2>
            <label>
              Select Shipping Method:
              <select
                value={shippingMethod}
                onChange={(e) => setShippingMethod(e.target.value)}
              >
                <option value="Standard">Standard</option>
                <option value="Express">Express</option>
              </select>
            </label>
            <div className="order-summary">
              <h2>Order Summary</h2>
              <p>Subtotal: ${subtotal.toFixed(2)}</p>
              <p>Tax: ${tax.toFixed(2)}</p>
              <p>Shipping: ${shippingCost.toFixed(2)}</p>
              <p>Total: ${total.toFixed(2)}</p>
            </div>
            <button type="submit">Submit Order</button>
          </form>
        </div>
  
        <Link to="/CartPage">Back to Cart</Link>
      </div>
    );
  };
  
  export default CheckoutPage;
