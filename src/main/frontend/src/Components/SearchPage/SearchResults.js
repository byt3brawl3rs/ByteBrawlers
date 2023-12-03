import React, {useEffect, useState} from "react";
import ItemCard from "../MainWebPage/ItemCard";
import "./CSS/SearchResults.css"

function SearchResults() {
    const [items, setItems] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);
        fetch("http://localhost:8080/items")
            .then(response => response.json())
            .then((data) => {
                setItems(data);
                setLoading(false);
            })

    }, []);

    if (loading) {
        return <p>Loading...</p>;
    }

    return (<div className="SearchResults">
        {items.map(item =>
            <ItemCard key={item.id} title={item.title}
                      description={item.description}
                      price={item.price} imagePath="RippedJeans.jpg"/>
        )
        }
    </div>);
}

export default SearchResults;