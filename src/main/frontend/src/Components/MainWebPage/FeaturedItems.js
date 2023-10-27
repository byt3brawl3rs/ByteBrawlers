import React, {useEffect, useState} from "react";
import ItemCard from "./ItemCard";
import Swipe from "./Swipe";


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
            <Swipe direction="&#8249;"/>
            <div>{listItems}</div>
            <Swipe direction="&#8250;"/>
        </div>
    );

}

export default FeaturedItems;