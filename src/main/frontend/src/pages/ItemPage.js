import React, { Component } from "react";
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import "../Components/MainWebPage/CSS/ItemPage.css";
import {useNavigate} from "react-router-dom";

const ItemPage = () => {
  const navigate = useNavigate();
  const title = "Item Title";
  const description = "Item Description";
  const price = "Item Price";
  const itemPhoto = "Filler Photo";
  const review = "Filler Review";

  const toCart = () => {
    navigate("./CartPage", {
      state: {
        itemName: title,
        itemPrice: price,
        itemQuantity: document.querySelector(".quantity-selector input").value,
        itemSize: document.querySelector(".size-selector select").value,
      },
    });
  };

    return (
      <div>
        <Header />
        <div className="ItemPage">
          <div className="item-details">
            <div className="item-photo">
              <img src="https://www.mrporter.com/variants/images/3633577411310824/in/w960_q60.jpg" alt={itemPhoto} />
            </div>
            <div className="item-actions">
              <h1>{title}</h1>
              <p className="big-font">{description}</p>
              <p className="price">{price}</p>
              <p className="review">{review}</p>
              <div className="quantity-selector">
                <label>Quantity </label><br></br>
                <input type="number" min="1" defaultValue="1" />
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
              <button type="submit" className="button" onClick={toCart}>Add to Cart</button>
            </div>
          </div>
        </div>
        <Footer />
      </div>
    );
  }

export default ItemPage;

