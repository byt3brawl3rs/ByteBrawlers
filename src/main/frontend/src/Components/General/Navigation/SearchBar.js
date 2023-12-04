import React, {useEffect} from "react";

import "./CSS/SearchBar.css";
import {useNavigate} from "react-router-dom";

function SearchBar(props) {
    const navigation = useNavigate();

    useEffect(() => {
        const keyDownHandler = event => {
            if (event.key === "Enter") {
                localStorage.setItem("searchParameter", "");
                navigation("/search");
            }
        }

        document.addEventListener('keydown', keyDownHandler);
    })

    return (
        <div className="SearchBar">
            <input placeholder="Search..." type="text"/>
        </div>
    );
}

export default SearchBar;