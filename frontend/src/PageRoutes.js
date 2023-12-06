import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import MainWebPage from "./pages/MainWebPage";
import LoginPage from "./pages/LoginPage";
import SignUpPage from "./pages/SignUpPage";
import CartPage from "./pages/CartPage";
import SearchPage from "./pages/SearchPage";
import ItemPage from "./pages/ItemPage";
import CheckoutPage from "./pages/CheckoutPage";
import UserProfilePage from "./pages/UserProfilePage";
import OrderPage from "./pages/OrderPage";

export const PageRoutes = () => {
    
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<MainWebPage/>}/>
                <Route path="/login" element={<LoginPage/>}/>
                <Route path="/signup" element={<SignUpPage/>}/>
                <Route path="/cart" element={<CartPage/>}/>
                <Route path="/search/" element={<SearchPage/>}/>
                <Route path="/item" element={<ItemPage/>}/>
                <Route path="/checkout" element={<CheckoutPage/>}/>
                <Route path="/profile" element={<UserProfilePage/>}/>
                <Route path="/order" element={<OrderPage/>}/>
            </Routes>
        </BrowserRouter>
    );
}