import React, {useEffect, useState} from "react";
import ItemCard from "./ItemCard";
import Swipe from "./Swipe";

function FeaturedItems(props) {
    const [cards, setCards] = useState([]);

    useEffect(() => {
        Promise.any(
            fetch("http://localhost:8080/items")
                .then(items => items.json())
                .then(items => {
                    items.map(item => {
                        let url = "http://localhost:8080/items/" + item.itemID + "/images";
                        fetch(url).then(images => images.json())
                            .then(images => setCards([...cards,
                                <ItemCard key={item.itemID} title={item.title} image={images[0]["imagePath"]}
                                          description={item.description}
                                          price={item.price} rating={item.rating}/>])
                            )
                    })
                })
        ).then(r => console.log(r))
    }, []);

    return (
        <div className="FeaturedItems">
            <Swipe direction="&#8249;"/>
            <div>{cards}</div>
            <Swipe direction="&#8250;"/>
        </div>
    );

}

export default FeaturedItems;