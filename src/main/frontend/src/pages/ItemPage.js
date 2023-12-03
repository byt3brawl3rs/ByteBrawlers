import React, {useEffect, useState} from "react";
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import "../Components/MainWebPage/CSS/ItemPage.css";
import {useLocation} from "react-router-dom";

function ItemPage() {
    const {state} = useLocation();
    const {id} = state;

    const [item, setItem] = useState({});
    const [loading, setLoading] = useState(false);

    useEffect(() => {
            setLoading(true);
            console.log(id)
            fetch(`http://localhost:8080/items/${id}`)
                .then(response => response.json()
                ).then(data => {
                setItem(data)
                setLoading(false);
            })
                .catch(err => err.message)
        }

        , [])

    if (loading) {
        return <p>Loading...</p>;
    }

    return (
        <div>
            <Header/>
            <div className="ItemPage">
                <div className="item-details">
                    <div className="item-photo">
                        <img src="https://www.mrporter.com/variants/images/3633577411310824/in/w960_q60.jpg"
                             alt=""/>
                    </div>
                    <div className="item-actions">
                        <h1>{item.title}</h1>
                        <p className="big-font">{item.description}</p>
                        <p className="price">{item.price}</p>
                        <p className="review">{item.rating}</p>
                        <div className="quantity-selector">
                            <label>Quantity </label><br></br>
                            <input type="number" min="1" defaultValue="1"/>
                        </div>
                        <div className="size-selector">
                            <label>Size</label><br></br>
                            <select>
                                <option value="s">Small</option>
                                <option value="m">Medium</option>
                                <option value="l">Large</option>
                                <option value="xl">X-Large</option>
                                <option value="2xl">XX-Large</option>
                            </select>
                        </div>
                        <button className="button">Add to Cart</button>
                    </div>
                </div>
            </div>
            <Footer/>
        </div>
    );
}

export default ItemPage;

