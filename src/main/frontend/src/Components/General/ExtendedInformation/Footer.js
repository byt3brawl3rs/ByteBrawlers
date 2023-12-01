import React from "react";
import Quote from "./Quote";
import References from "./References";
import Copyright from "./Copyright";
import './CSS/Footer.css'


function Footer(props) {
    return (
        <div className="Footer">
            <Quote/>
            <References/>
            <Copyright/>
        </div>
    );
}

export default Footer