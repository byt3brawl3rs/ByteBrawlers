import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import SignUpBox from "../Components/SignUpPage/SignUpBox"

class SignUpPage extends Component {
    render() {
        return (
            <div className="SignUpPage">
                <Header/>
                <SignUpBox/>
                <Footer/>
            </div>
        );
    }
}

export default SignUpPage;