import React, {useState} from "react";
import "./CSS/Filters.css"

function Filters() {
    const [colorFiler, setColorFilter] = useState("");

    return (<div className="Filters">
        <div className="Filter">
            <div id="container">
                <label id="title">Colors</label><br></br>
                <input type="checkbox" id="checkbox" value="Red"/>
                <label>Red</label><br></br>
                <input type="checkbox" id="checkbox" value="Green"/>
                <label>Green</label><br></br>
                <input type="checkbox" id="checkbox" value="Yellow"/>
                <label>Yellow</label><br></br>
                <input type="checkbox" id="checkbox" value="Blue"/>
                <label>Blue</label><br></br>
                <input type="checkbox" id="checkbox" value="Purple"/>
                <label>Purple</label><br></br>
                <input type="checkbox" id="checkbox" value="Orange"/>
                <label>Orange</label><br></br>
                <input type="checkbox" id="checkbox" value="Pink"/>
                <label>Pink</label><br></br>
                <input type="checkbox" id="checkbox" value="Black"/>
                <label>Black</label><br></br>
                <input type="checkbox" id="checkbox" value="White"/>
                <label>White</label><br></br>
                <input type="checkbox" id="checkbox" value="Gray"/>
                <label>Gray</label><br></br>
                <input type="checkbox" id="checkbox" value="Brown"/>
                <label>Brown</label><br></br>
                <input type="checkbox" id="checkbox" value="Tan"/>
                <label>Tan</label><br></br>
                <input type="checkbox" id="checkbox" value="Maroon"/>
                <label>Maroon</label><br></br>
                <input type="checkbox" id="checkbox" value="Navy"/>
                <label>Navy</label><br></br>
            </div>
        </div>

        <div className="Filter">
            <div id="container">
                <label id="title">Type</label><br></br>
                <input type="checkbox" id="checkbox" value="Shirt"/>
                <label>Shirt</label><br></br>
                <input type="checkbox" id="checkbox" value="Pants"/>
                <label>Pants</label><br></br>
                <input type="checkbox" id="checkbox" value="Shoes"/>
                <label>Shoes</label><br></br>
                <input type="checkbox" id="checkbox" value="Hat"/>
                <label>Hat</label><br></br>
                <input type="checkbox" id="checkbox" value="Gloves"/>
                <label>Gloves</label><br></br>
                <input type="checkbox" id="checkbox" value="Scarf"/>
                <label>Scarf</label><br></br>
            </div>
        </div>

        <div className="Filter">
            <div id="container">
                <label id="title">Size</label><br></br>
                <input type="checkbox" id="checkbox" value="S"/>
                <label>S</label><br></br>
                <input type="checkbox" id="checkbox" value="M"/>
                <label>M</label><br></br>
                <input type="checkbox" id="checkbox" value="L"/>
                <label>L</label><br></br>
                <input type="checkbox" id="checkbox" value="XL"/>
                <label>XL</label><br></br>
                <input type="checkbox" id="checkbox" value="XXL"/>
                <label>XXL</label><br></br>
                <input type="checkbox" id="checkbox" value="XXXL"/>
                <label>XXXL</label><br></br>
            </div>
        </div>
        <div className="Filter">
            <div id="container">
                <label id="title">Socialization</label><br></br>
                <input type="checkbox" id="checkbox" value="Mens"/>
                <label>Mens</label><br></br>
                <input type="checkbox" id="checkbox" value="Womens"/>
                <label>Womens</label><br></br>
                <input type="checkbox" id="checkbox" value="Childrens"/>
                <label>Childrens</label><br></br>
                <input type="checkbox" id="checkbox" value="Unisex"/>
                <label>Unisex</label><br></br>
            </div>
        </div>
    </div>);
}

export default Filters;