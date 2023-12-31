import React from "react";
import './ItemCard.css';

export default function ItemCard(props) {
    return (
        <div className="ItemCard">
            <p id="title">{props.title}</p>
            <img id="itemPhoto" alt="" src="./upload/Ripped%20Jeans.jpg"></img>
            <p className="description">{props.description}</p>
            <p className="price">${props.price}</p>
            <img id="review" alt="" src="./upload/1star.jpeg"></img>
        </div>
    );

}