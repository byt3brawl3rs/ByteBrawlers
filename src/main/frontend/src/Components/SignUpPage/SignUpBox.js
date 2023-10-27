import React from "react";
import TextBox from "../General/InputTextBox/TextBox";

function SignUpBox(props) {
    return (
        <div className="SignUpBox">
            <TextBox title="First Name" type="text" placeholder="First Name"/>
            <TextBox title="Last Name" type="text" placeholder="Last Name"/>
            <TextBox title="Email" type="text" placeholder="example@gmail.com"/>
            <TextBox title="Username" type="text" placeholder="Username"/>
            <TextBox title="Password" type="text" placeholder="Password"/>
        </div>
    );
}

export default SignUpBox;