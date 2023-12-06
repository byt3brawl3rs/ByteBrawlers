import React from "react";
import './CSS/ItemCard.css';
import {useNavigate} from "react-router-dom";

// {require(props.rating)}
function ItemCard(props) {
    const navigation = useNavigate()
    const handleItemClick = () => {
        console.log(props.id)
        navigation("/item", {
            state: {
                id: props.id
            }
        })
    }

    return (
        <div className="ItemCard">
            <a onClick={handleItemClick}>
                <p id="title">{props.title}</p>
                <img id="itemPhoto" alt="" src={require("./Images/" + props.imagePath)}/>
                <p className="description">{props.description}</p>
                <p className="price">${props.price}</p>
                <img id="review" alt="" src=""/>
            </a>
        </div>
    );

}

export default ItemCard;