import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import Footer from "../Components/General/ExtendedInformation/Footer";
import LoginBox from "../Components/LoginPage/LoginBox";

class LoginPage extends Component {
    render() {
        return (
            <div className="LoginPage">
                <Header/>
                <LoginBox/>
                <Footer/>
            </div>
        );
    }
}

export default LoginPage;