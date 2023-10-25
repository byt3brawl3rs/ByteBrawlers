import React, {Component} from "react";

class ItemCard extends Component {
    render() {
        return (
            <div className="ItemCard">
                <p id="title">Product Title</p>
                <img id="itemPhoto" alt="" src="./Images/Ripped%20Jeans.jpg"></img>
                <p className="price"></p>$0.00
                <img id="review" alt="" src="./Images/1star.jpeg"></img>
            </div>
        );
    }
}

export default ItemCard;