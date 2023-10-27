import React from "react";

function Catagories(props) {
    return (
        <div className="Catagories">
            <p>{props.category}</p>
            <img src={props.image} alt={props.alt}/>
        </div>
    );
}

export default Catagories