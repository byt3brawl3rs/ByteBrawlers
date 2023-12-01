import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import FeaturedItems from "../Components/MainWebPage/FeaturedItems";
import Banner from "../Components/MainWebPage/Banner";
import MainCategories from "../Components/MainWebPage/MainCategories";
import Footer from "../Components/General/ExtendedInformation/Footer";

import './CSS/Normalize.css'


class MainWebPage extends Component {
    render() {
        return (
            <div className="MainWebPage">
                <Header/>
                <Banner/>
                <FeaturedItems/>
                <MainCategories/>
                <Footer/>
            </div>
        );
    }
}

export default MainWebPage;