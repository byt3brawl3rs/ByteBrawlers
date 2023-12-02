import React from "react";
import Quote from "../../MainWebPage/Quote";
import References from "./References";
import Copyright from "./Copyright";
import './CSS/Footer.css'


function Footer(props) {
    return (
        <div className="Footer">
            <References/>
            <Copyright/>
        </div>
    );
}

export default Footer