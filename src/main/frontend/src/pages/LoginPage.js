import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import LoginBox from "../Components/LoginPage/LoginBox";

class LoginPage extends Component {
    render() {
        return (
            <div className="LoginPage">
                <Header/>
                <LoginBox/>
            </div>
        );
    }
}

export default LoginPage;