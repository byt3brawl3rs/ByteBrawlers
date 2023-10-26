import React, {Component} from "react";
import SearchBar from "./SearchBar";

import "./NavigationBar.css";

function NavigationBar() {
    // const navigationBar = ;
    return (
        <div className="NavigationBar">
            <SearchBar/>
            <a href="">Home</a>
            <a href="">About</a>
            <a style={{float: "right"}} href="/signup">SignUp</a>
            <a style={{float: "right"}} href="/login">Login</a>
            <a style={{float: "right"}} href="/cart">Cart</a>
        </div>
    );

}

export default NavigationBar;