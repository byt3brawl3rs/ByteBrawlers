import React, {useEffect, useState} from "react";
import ItemCard from "../MainWebPage/ItemCard";
import "./CSS/SearchResults.css"

function SearchResults() {

    const [databaseUrl, setDatabaseUrl] = useState("");

    useEffect(() => {
        setDatabaseUrl(window.REACT_APP_DATABASE_URL || 'default-value');
    }, []);
    const [items, setItems] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);
        const searchParameter = localStorage.getItem("searchParameter")
        let url = ""
        if (searchParameter === null || searchParameter === "") {
            url = databaseUrl + `/items/search`
        } else {
            url = databaseUrl + `/items/search/${searchParameter}`
        }

        fetch(url)
            .then(response => response.json())
            .then((data) => {
                setItems(data);
                setLoading(false);
            })

    }, []);

    if (loading) {
        return <p>Loading...</p>;
    }
    console.log(items)
    return (<div className="SearchResults">

        {items.map(item =>
            <ItemCard id={item.id} title={item.title}
                      description={item.description}
                      price={item.price} imagePath="RippedJeans.jpg"/>
        )
        }
    </div>);
}

export default SearchResults;