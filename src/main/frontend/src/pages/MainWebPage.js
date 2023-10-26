import React, {Component} from "react";
import Header from "../Components/Navigation/Header";
import FeaturedItems from "../Components/DisplayedItems/FeaturedItems";

class MainWebPage extends Component {
    render() {
        return (
            <div className="MainWebPage">
                <Header/>
                <FeaturedItems/>
            </div>
        );
    }
}

export default MainWebPage;