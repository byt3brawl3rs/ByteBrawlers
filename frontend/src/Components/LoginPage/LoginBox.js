import React, {useEffect, useState} from "react";
import {useNavigate} from "react-router-dom";
import './CSS/SignUpBox.css';

function LoginBox() {
    const [databaseUrl, setDatabaseUrl] = useState("");

    useEffect(() => {
        setDatabaseUrl(window.REACT_APP_DATABASE_URL || 'default-value');
    }, []);

    const [customerId, setCustomerId] = useState(0);
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [errorMessage, setErrorMessage] = useState("");
    const navigate = useNavigate();

    const login = (event) => {
        const loginCredentials = {username, password};
        event.preventDefault()
        const results = fetch(databaseUrl + `/customer/login`, {
            method: "POST",
            headers: {"content-type": "application/json"},
            body: JSON.stringify(loginCredentials)
        }).then(response => response.json())
            .then((data) => {
                console.log(data)
                if (data.valid) {
                    return fetch(`http://localhost:8080/customer/login/${username}`, {
                        method: "POST",
                        headers: {"content-type": "application/json"},
                        body: JSON.stringify(username)
                    })
                        .then(response => response.json())
                        .then(data => {
                            localStorage.setItem("currentUser", JSON.stringify({
                                id: data.id,
                                username: data.username,
                                first: data.firstName,
                                last: data.lastName
                            }));
                            localStorage.setItem("isLoggedIn", true);
                            navigate("/");
                        })
                } else {
                    setErrorMessage(data.message);
                }
            })
    }

    return (
        <div className="LoginBox">
            <div className="MainBox">
                <div className="container">
                    <form>
                        <label htmlFor="username"><b>Username</b></label>
                        <input name="username" id="username" type="text" value={username}
                               onChange={event => setUsername(event.target.value)}/>
                        <br/>
                        <label htmlFor="password"><b>Password</b></label>
                        <input name="password" id="password" type="password" value={password}
                               onChange={event => setPassword(event.target.value)}/>
                        <br/>
                        <button type="submit" onClick={login}>Login</button>
                    </form>
                    <p>{errorMessage}</p>
                </div>
            </div>
        </div>);
}

export default LoginBox;