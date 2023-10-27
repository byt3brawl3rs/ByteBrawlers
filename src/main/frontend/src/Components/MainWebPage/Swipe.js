import React from "react";
import './CSS/Swipe.css'

function Swipe(props) {
    return (
        <div className="Swipe">
            <button>{props.direction}</button>
        </div>
    );
}

export default Swipe;