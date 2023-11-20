import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import MainWebPage from "./pages/MainWebPage";
import LoginPage from "./pages/LoginPage";
import SignUpPage from "./pages/SignUpPage";
import CartPage from "./pages/CartPage";
import Search from "./pages/Search";

export const PageRoutes = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/i" element={<MainWebPage/>}/>
                <Route path="/login" element={<LoginPage/>}/>
                <Route path="/signup" element={<SignUpPage/>}/>
                <Route path="/cart" element={<CartPage/>}/>
                <Route path="/" element={<Search/>}/>
            </Routes>
        </BrowserRouter>
    );
}