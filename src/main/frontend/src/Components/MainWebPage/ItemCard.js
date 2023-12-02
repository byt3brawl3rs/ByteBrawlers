import React from "react";
import './CSS/ItemCard.css';

// {require(props.rating)}
function ItemCard(props) {
    return (
        <div className="ItemCard">
            <p id="title">{props.title}</p>
            <img id="itemPhoto" alt="" src={require("./Images/" + props.imagePath)}/>
            <p className="description">{props.description}</p>
            <p className="price">${props.price}</p>
            <img id="review" alt="" src=""/>
        </div>
    );

}

export default ItemCard;