import React from "react";
import NavigationBar from "./NavigationBar";
import CategoryBar from "./CategoryBar"

import "./CSS/Header.css";


function Header(props) {
    return (
        <header className="Header">
            <NavigationBar/>
            <CategoryBar/>
        </header>
    );
}

export default Header;