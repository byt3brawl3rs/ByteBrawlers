import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import FeaturedItems from "../Components/MainWebPage/FeaturedItems";
import Banner from "../Components/MainWebPage/Banner";
import MainCategories from "../Components/MainWebPage/MainCategories";
import Footer from "../Components/General/ExtendedInformation/Footer";
import ItemCard from "../Components/MainWebPage/ItemCard";
import ItemPage from "../FrontEnd/pages/ItemPage";

class MainWebPage extends Component {
    state = {
        selectedItem: null,
    };
    
    handleItemClick = (item) => {
        this.setState({ selectedItem: item });
    };

    render() {
        const { selectedItem } = this.state || {};
        return (
            <div className="MainWebPage">
                <Header/>
                <Banner/>
                <FeaturedItems onItemClick={this.handleItemClick} />
                <MainCategories/>
                <Footer/>
                {selectedItem && <ItemPage {...selectedItem} />}
            </div>
        );
    }
}

export default MainWebPage;