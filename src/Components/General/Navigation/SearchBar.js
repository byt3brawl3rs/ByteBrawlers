import React, {useEffect, useState} from "react";

import "./CSS/SearchBar.css";
import {useNavigate} from "react-router-dom";

function SearchBar(props) {
    const [searchParameter, setSearchParameter] = useState("")
    const navigation = useNavigate();


    useEffect(() => {
        const keyDownHandler = async event => {
            if (event.key === "Enter") {
                await localStorage.setItem("searchParameter", searchParameter);
                window.location.reload();
                navigation("/search");
            }
        }

        document.addEventListener('keydown', keyDownHandler);
    })

    return (
        <div className="SearchBar">
            <input id="searchBar" placeholder="Search..." type="text" value={searchParameter}
                   onChange={event => setSearchParameter(event.target.value)}/>
        </div>
    );
}

export default SearchBar;