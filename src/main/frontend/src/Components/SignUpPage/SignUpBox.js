import React, {useEffect, useState} from "react";
import axios from "axios";
import '../LoginPage/CSS/SignUpBox.css';
import {Navigate, useNavigate} from "react-router-dom";


function SignUpBox() {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [valid, setValid] = useState(false);
    const navigate = useNavigate();
    const [displayValue, setDisplayValue] = useState("none");

    const signup = (event) => {
        event.preventDefault();
        const customerProfile = {firstName, lastName, email, username, password}
        fetch("http://localhost:8080/customer", {
            method: "POST",
            headers: {"content-type": "application/json"},
            body: JSON.stringify(customerProfile)
        }).then((response) => {
            if (response.ok) {
                console.log("Customer Added");
                navigate("/")
            } else {
                setDisplayValue("block")
                throw new Error("Username taken");
            }
        }).catch((error) => {
            console.log(error.message)
        })
    }

    return (
        <div className="MainBox">
            <div className="container">
                <div className="errorMessage" style={{display: displayValue}}>Username Taken.</div>
                <form>
                    <label htmlFor="firstName"><b>First Name</b></label>
                    <input name="firstName" id="firstName" type="text" value={firstName}
                           onChange={event => setFirstName(event.target.value)}/>
                    <br/>
                    <label htmlFor="lastName"><b>Last Name</b></label>
                    <input name="lastName" id="lastName" type="text" value={lastName}
                           onChange={event => setLastName(event.target.value)}/>
                    <br/>
                    <label htmlFor="email"><b>Email</b></label>
                    <input name="email" id="email" type="text" value={email}
                           onChange={event => setEmail(event.target.value)}/>
                    <br/>
                    <label htmlFor="username"><b>Username</b></label>
                    <input name="username" id="username" type="text" value={username}
                           onChange={event => setUsername(event.target.value)}/>
                    <br/>
                    <label htmlFor="password"><b>Password</b></label>
                    <input name="password" id="password" type="text" value={password}
                           onChange={event => setPassword(event.target.value)}/>
                    <br/>
                    <button type="submit" onClick={signup}>Create Account</button>
                </form>
            </div>
        </div>
    );


}

export default SignUpBox;

