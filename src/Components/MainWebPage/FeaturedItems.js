import React, {useEffect, useState} from "react";
import ItemCard from "./ItemCard";
import Swipe from "./Swipe"
import "./CSS/FeaturedItems.css"

function FeaturedItems(props) {
    const [cards, setCards] = useState([]);
    const [loading, setLoading] = useState(false);
    const [visibleSection, setVisibleSection] = useState(0);

    useEffect(() => {
        setLoading(true);

        fetch("http://ec2-3-228-117-228.compute-1.amazonaws.com:5432/d5fqelkp50lmhm/items/featuredItems")
            .then(response => response.json())
            .then(data => {
                setCards(data);
                setLoading(false)
            })
    }, []);

    if (loading) {
        return <p>Loading...</p>;
    }

    return (
        <div className="FeaturedItems">
            <Swipe direction="&#8249;"/>
            <div className="Cards">{cards.map(card => <ItemCard key={card.id} id={card.id} title={card.title}
                                                                description={card.description}
                                                                price={card.price} imagePath="RippedJeans.jpg"/>
            )
            }</div>
            <Swipe direction="&#8250;"/>
        </div>
    );

}

export default FeaturedItems;