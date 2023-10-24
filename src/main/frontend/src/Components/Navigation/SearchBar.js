import React, {Component} from "react";

import "./SearchBar.css";

class SearchBar extends Component {
    render() {
        return (
            <div className="SearchBar">
                <input placeholder="Search..." type="text"/>
                <i></i>
            </div>
        );
    }
}

export default SearchBar;