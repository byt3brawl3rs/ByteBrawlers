import React, { Component } from "react";
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import "../Components/MainWebPage/CSS/ItemPage.css";

class ItemPage extends Component {
  render() {
    //const { title, description, price, itemPhoto, review} = this.props;
    const title = "Item Title";
    const description = "Item Description";
    const price = "Item Price";
    const itemPhoto = "";
    const review = "";

    return (
      <div>
        <Header />
        <div className="ItemPage">
          <div className="item-details">
            <div className="item-photo">
              <img src="" alt={title} />
            </div>
            <div className="item-actions">
              <h1>{title}</h1>
              <div className="quantity-selector">
                <label>Quantity:</label>
                <input type="number" min="1" defaultValue="1" />
              </div>
              <div className="size-selector">
                <label>Size:</label>
                <select>
                  <option value="s">Small</option>
                  <option value="m">Medium</option>
                  <option value="l">Large</option>
                </select>
              </div>
              <button className="button">Add to Cart</button>
              <img id="review" alt="Review" src="" />
              <p>${price}</p>
            </div>
            <div className="item-description">
              <h2>Description:</h2>
              <p>{description}</p>
            </div>
          </div>
        </div>
        <Footer />
      </div>
    );
  }
}

export default ItemPage;
