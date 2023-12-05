import React from "react";
import Filters from "./Filters";
import SearchResults from "./SearchResults";
import "./CSS/SearchTest.css"

function SearchTest() {

    return (<div className="SearchTest">
        <Filters/>
        <SearchResults/>
    </div>);
}

export default SearchTest;