import React from "react";
import './CSS/References.css'

function References(props) {
    return (
        <div className="References">
            <ul>
                <li><p>Help and Information</p></li>
                <li><a href="">Your Account</a></li>
                <li><a href="">Your Orders</a></li>
                <li><a href="">Track Order</a></li>
                <li><a href="">Returns</a></li>
                <li><a href="">More Information</a></li>
            </ul>
            <ul>
                <li><p>About Us</p></li>
                <li><a href="">About</a></li>
                <li><a href="">Locations</a></li>
                <li><a href="">Reviews</a></li>
                <li><a href="">Carbon Footprint</a></li>
            </ul>
            <ul>
                <li><p>More From Us</p></li>
                <li><a href="">E-gift Cards</a></li>
                <li><a href="">Refer a Friend</a></li>
            </ul>
        </div>
    );
}

export default References