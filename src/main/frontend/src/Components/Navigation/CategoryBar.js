import React, {Component} from "react";
import "./CategoryBar.css";

class CategoryBar extends Component {
    render() {
        return (
            <div className="CategoryBar">
                <a href="">Mens</a>
                <a href="">Womens</a>
                <a href="">Kids</a>
                <a href="">Active Wear</a>
                <a href="">Shoes</a>
                <a href="">Accessories</a>
            </div>
        );
    }
}

export default CategoryBar;