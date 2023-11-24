import React, {useState} from "react";
import axios from "axios";
import '/Users/mona/Documents/cse201/project/ByteBrawlers/src/main/frontend/src/Components/MainWebPage/CSS/SignUpBox.css';

function SignUpBox() {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [emailService, setEmailService] = useState(false);
    const [userIcon, setUserIcon] = useState("");
    const [selectedIcon, setSelectedIcon] = useState("");

    const handleIconSelect = (icon) => {
        setSelectedIcon(icon);
    }

    async function signup(event) {
        event.preventDefault();
        try {
            await axios.post("http://localhost:8080/customer/login", {
                firstName: firstName,
                lastname: lastName,
                email: email,
                username: username,
                password: password,
                emailService: emailService,
                userIcon: userIcon
            }).then(response => {
                console.log(response.data)
            });
        } catch (error) {
            alert(error);
        }
    }

    return (
        <div className="MainBox">
            <div className="container">
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

                    <div className="form-check">
                        <input className="form-check-input" type="checkbox" id="emailService"
                               checked={emailService} onChange={() => setEmailService(!emailService)}/>
                        <label className="form-check-label" htmlFor="emailService">
                            Subscribe to Email Service
                        </label>
                    </div>

                    <i className="bi bi-cloud-haze2"></i>

                    <div className="form-group">
                        <label><b>Select User Icon</b></label>
                        <div className="icon-selection">
                            <button onClick={() => handleIconSelect("gpu-card")} className="icon-button-left">
                                <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                                     className="bi bi-backpack2-fill" viewBox="0 0 16 16">
                                    <path d="M5 13h6v-3h-1v.5a.5.5 0 0 1-1 0V10H5z"/>
                                    <path
                                        d="M6 2v.341C3.67 3.165 2 5.388 2 8v1.191l-1.17.585A1.5 1.5 0 0 0 0 11.118V13.5A1.5 1.5 0 0 0 1.5 15h1c.456.607 1.182 1 2 1h7c.818 0 1.544-.393 2-1h1a1.5 1.5 0 0 0 1.5-1.5v-2.382a1.5 1.5 0 0 0-.83-1.342L14 9.191V8a6.002 6.002 0 0 0-4-5.659V2a2 2 0 1 0-4 0m2-1a1 1 0 0 1 1 1v.083a6.04 6.04 0 0 0-2 0V2a1 1 0 0 1 1-1m0 3a4 4 0 0 1 3.96 3.43.5.5 0 1 1-.99.14 3 3 0 0 0-5.94 0 .5.5 0 1 1-.99-.14A4 4 0 0 1 8 4M4.5 9h7a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5v-4a.5.5 0 0 1 .5-.5"/>
                                </svg>
                            </button>

                            <button onClick={() => handleIconSelect("gpu-card")} className="icon-button-right">
                                <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                                     className="bi bi-gpu-card" viewBox="0 0 16 16">
                                    <path
                                        d="M4 8a1.5 1.5 0 1 1 3 0 1.5 1.5 0 0 1-3 0m7.5-1.5a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0-3"/>
                                    <path
                                        d="M0 1.5A.5.5 0 0 1 .5 1h1a.5.5 0 0 1 .5.5V4h13.5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-.5.5H2v2.5a.5.5 0 0 1-1 0V2H.5a.5.5 0 0 1-.5-.5m5.5 4a2.5 2.5 0 1 0 0 5 2.5 2.5 0 0 0 0-5M9 8a2.5 2.5 0 1 0 5 0 2.5 2.5 0 0 0-5 0"/>
                                    <path
                                        d="M3 12.5h3.5v1a.5.5 0 0 1-.5.5H3.5a.5.5 0 0 1-.5-.5zm4 1v-1h4v1a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5"/>
                                </svg>
                            </button>

                        </div>
                    </div>

                    <button type="submit" onClick={signup}>Create Account</button>
                </form>
            </div>
        </div>
    );


}

export default SignUpBox;

