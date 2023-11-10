import React from "react";
import './CSS/ItemCard.css';

// {require(props.rating)}
function ItemCard(props) {
    let image = require(props.image);
    return (
        <div className="ItemCard">
            <p id="title">{props.title}</p>
            <img id="itemPhoto" alt="" src='../../../public/Images/RippedJeans.jpg'/>
            <p className="description">{props.description}</p>
            <p className="price">${props.price}</p>
            <img id="review" alt="" src=""/>
        </div>
    );

}

export default ItemCard;