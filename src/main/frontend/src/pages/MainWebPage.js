import React, { Component } from "react";
import Header from "../Components/General/Navigation/Header";
import FeaturedItems from "../Components/MainWebPage/FeaturedItems";
import Banner from "../Components/MainWebPage/Banner";
import MainCategories from "../Components/MainWebPage/MainCategories";
import Footer from "../Components/General/ExtendedInformation/Footer";

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
        <Header />
        <Banner />
        <FeaturedItems onItemClick={this.handleItemClick} />
        <MainCategories />
        <Footer />
      </div>
    );
  }
}

export default MainWebPage;
