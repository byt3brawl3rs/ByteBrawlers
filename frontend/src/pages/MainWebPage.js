import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import FeaturedItems from "../Components/MainWebPage/FeaturedItems";
import Banner from "../Components/MainWebPage/Banner";
import MainCategories from "../Components/MainWebPage/MainCategories";
import Footer from "../Components/General/ExtendedInformation/Footer";
import Quote from "../Components/MainWebPage/Quote";


class MainWebPage extends Component {

    render() {
        console.log("Hello world")
        return (
            <div className="MainWebPage">
                <Header/>
                <Banner/>
                <FeaturedItems/>
                <MainCategories/>
                <Quote/>
                <Footer/>
            </div>
        );
    }
}

export default MainWebPage;