import React, {useEffect, useState} from "react";
import ItemCard from "./ItemCard";
import Swipe from "./Swipe"
import "./CSS/FeaturedItems.css"

function FeaturedItems(props) {
    const [cards, setCards] = useState([]);
    const [loading, setLoading] = useState(false);
    const [visibleSection, setVisibleSection] = useState(0);

    const [databaseUrl, setDatabaseUrl] = useState("");

    useEffect(() => {
        setDatabaseUrl(window.REACT_APP_DATABASE_URL || 'default-value');
    }, []);

    useEffect(() => {
        setLoading(true);

        fetch(databaseUrl + "/items/featuredItems")
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