import React from "react";

export default function Swipe(props) {
    return (
        <div className="Swipe">
            <button>{props.direction}</button>
        </div>
    );
}