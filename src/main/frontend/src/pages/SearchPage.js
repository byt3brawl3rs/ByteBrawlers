import React, {Component} from 'react';

import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import SearchTest from "../Components/SearchPage/SearchTest";

class SearchPage extends Component {
    render() {
        return (<div>
            <Header/>
            <SearchTest/>
            <Footer/>
        </div>);
    }
}

export default SearchPage;