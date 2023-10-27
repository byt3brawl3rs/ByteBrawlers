import React from "react";
import Swipe from "./Swipe";
import './CSS/Banner.css'

function Banner(props) {
    return (
        <div className="Banner">
            <Swipe direction="&#8249;"/>
            <div className="MainBanner">

            </div>
            <Swipe direction="&#8250;"/>
        </div>
    );
}

export default Banner