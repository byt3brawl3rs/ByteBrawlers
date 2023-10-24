import React, {Component} from "react";
import SearchBar from "./SearchBar";

import "./NavigationBar.css";

class NavigationBar extends Component {
    render() {
        return (
            <div className="NavigationBar">
                <SearchBar/>
                <a href="">Home</a>
                <a href="">About</a>
                <a style={{float: "right"}} href="">SignUp</a>
                <a style={{float: "right"}} href="">Login</a>
                <a style={{float: "right"}} href="">Cart</a>
            </div>
        );
    }
}

export default NavigationBar;