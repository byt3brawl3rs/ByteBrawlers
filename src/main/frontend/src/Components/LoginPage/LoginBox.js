import React, {useState} from "react";
import {useNavigate} from "react-router-dom";
import axios from "axios";
import '/Users/mona/Documents/cse201/project/ByteBrawlers/src/main/frontend/src/Components/MainWebPage/CSS/SignUpBox.css';

function LoginBox() {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [errorMessage, setErrorMessage] = useState("");
    const navigate = useNavigate();

    async function login(event) {
        event.preventDefault();
        try {
            await axios.post("http://localhost:8080/customer/login", {
                username: username,
                password: password
            }).then(response => {
                console.log(response.data)
                if (response.data.valid) {
                    navigate("/");
                } else {
                    setErrorMessage(response.data.message);
                }
            });
        } catch (error) {
            alert(error);
        }
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
                        <input name="password" id="password" type="text" value={password}
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