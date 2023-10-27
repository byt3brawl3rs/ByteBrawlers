import React from "react";

function TextBox(props) {
    return (
        <div className="TextBox">
            <p>{props.title}</p>
            <input type={props.type} placeholder={props.placeholder}/>
        </div>
    );
}

export default TextBox;