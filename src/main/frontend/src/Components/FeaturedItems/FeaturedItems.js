import React, {Component, useState} from "react";
import SwipeLeft from "./SwipeLeft";
import ItemCard from "./ItemCard";
import SwipeRight from "./SwipeRight";

class FeaturedItems extends Component {
    render() {
        return (
            <div className="FeaturedItems">
                <SwipeLeft/>
                <SwipeRight/>
            </div>
        );
    }
}

export default FeaturedItems;