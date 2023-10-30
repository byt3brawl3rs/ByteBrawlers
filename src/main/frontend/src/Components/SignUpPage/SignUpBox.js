import React, {ChangeEvent, Component, useState} from "react";

async function postData(url = "", data = {}) {
    const response = await fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data),
        redirect: "follow"
    });

    return await response.json();
}

function SignUpBox() {
    const handleSubmit = (event) => {
        const data = Array.from(event.target.elements)
            .filter((input) => input.name)
            .reduce((obj, input) => Object.assign(obj, {[input.name]: input.value}), {});
        console.log(data);
        postData("http://localhost:8080/customer", data).then(response => console.log(response));
    }


    return (
        <div className="SignUpBox">
            <form onSubmit={handleSubmit} target="/">
                <label htmlFor="firstName"><b>First Name</b></label>
                <input name="firstName" id="firstName" type="text"/>
                <br/>
                <label htmlFor="lastName"><b>Last Name</b></label>
                <input name="lastName" id="lastName" type="text"/>
                <br/>
                <label htmlFor="email"><b>Email</b></label>
                <input name="email" id="email" type="text"/>
                <br/>
                <label htmlFor="username"><b>Username</b></label>
                <input name="username" id="username" type="text"/>
                <br/>
                <label htmlFor="password"><b>Password</b></label>
                <input name="password" id="password" type="text"/>
                <br/>
                <input type="submit" value="Create Account"/>
            </form>
        </div>
    );


}

export default SignUpBox;

