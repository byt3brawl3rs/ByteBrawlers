import React, {useEffect, useState} from "react";
import SwipeLeft from "./SwipeLeft";
import ItemCard from "./ItemCard";
import SwipeRight from "./SwipeRight";

function FeaturedItems(props) {
    const [items, setItems] = useState([]);
    const listItems = items.map(item => <ItemCard title={item.title} description={item.description}
                                                  price={item.price}/>);

    useEffect(() => {
        fetch("http://localhost:8080/items")
            .then(response => {
                return response.json()
            }).then(items => {
            setItems(items)
        });
    }, []);
    return (
        <div className="FeaturedItems">
            <SwipeLeft/>
            <div>{listItems}</div>
            <SwipeRight/>
        </div>
    );

}

export default FeaturedItems;