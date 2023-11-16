import React from "react";
import './CSS/ItemCard.css';

// {require(props.rating)}
function ItemCard() {
    let props = {
        "title": "RifjvsohgoishgoiwdDFs",
        "description": "Hvadfvalitans",
        "price": 100.99,
        "rating": 3.00
    }
    return (
        <div className="ItemCard">
            <p id="title">{props.title}</p>
            <img id="itemPhoto" alt="" src={require("./Images/RippedJeans.jpg")}/>
            <p id="description">{props.description}</p>
            <p id="price">${props.price}</p>
            <img id="review" alt="" src=""/>
        </div>
    );

}

export default ItemCard;