import React, { useState, useEffect } from 'react';
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import '../Components/OrderPage/CSS/OrderPage-style.css'; 

const OrderPage = () => {
    const [orders, setOrders] = useState([]);
    

    useEffect(() => {
        setOrders([
            { id: 1, name: 'Stylish Shirt', quantity: 2, price: 59.98 },
            { id: 2, name: 'Comfortable Jeans', quantity: 1, price: 49.99 },
        ]);
    }, []);

    return (
        <div className="OrderPage">
            <Header />
            <h1>Your Orders</h1>
            <div className="orders-container">
                {orders.map(order => (
                    <div key={order.id} className="order-item">
                        <h2>{order.name}</h2>
                        <p>Quantity: {order.quantity}</p>
                        <p>Total Price: ${order.price.toFixed(2)}</p>
                    </div>
                ))}
            </div>
            <Footer />
        </div>
    );
};

export default OrderPage;
