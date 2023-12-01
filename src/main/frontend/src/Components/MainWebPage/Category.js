import React from "react";
import './CSS/Category.css'

function Category(props) {
    return (
        <div className="Category">
            <p>{props.category}</p>
            <img src={props.image} alt={props.alt}/>
        </div>
    );
}

export default Category;