import React, {Component} from "react";
import NavigationBar from "./NavigationBar";
import CategoryBar from "./CategoryBar"

import "./Header.css";


class Header extends Component {
    render() {
        return (
            <header className="Header">
                <NavigationBar/>
                <CategoryBar/>
            </header>
        );
    }
}

export default Header;