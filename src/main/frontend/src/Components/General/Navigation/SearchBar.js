import React from "react";

import "./CSS/SearchBar.css";

function SearchBar(props) {
    return (
        <div className="SearchBar">
            <input placeholder="Search..." type="text"/>
        </div>
    );
}

export default SearchBar;