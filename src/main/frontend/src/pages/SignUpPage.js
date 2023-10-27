import React, {Component} from "react";
import Header from "../Components/General/Navigation/Header";
import SignUpBox from "../Components/SignUpPage/SignUpBox"

class SignUpPage extends Component {
    render() {
        return (
            <div className="SignUpPage">
                <Header/>
                <SignUpBox/>
            </div>
        );
    }
}

export default SignUpPage;