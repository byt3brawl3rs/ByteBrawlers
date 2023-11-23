import React, {useState} from "react";
import axios from "axios";

function SignUpBox() {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [emailService, setEmailService] = useState(false);
    const [userIcon, setUserIcon] = useState("");

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
        <div className="SignUpBox">
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

                <div className="form-group">
                    <label htmlFor="userIcon"><b>Select User Icon</b></label>
                    <select className="form-control" id="userIcon" value={userIcon}
                            onChange={event => setUserIcon(event.target.value)}>
                        <option value="">Choose...</option>
                        <option value="icon1">Icon 1</option>
                        <option value="icon2">Icon 2</option>
                    </select>
                </div>

                <button type="submit" onClick={signup}>Create Account</button>
            </form>
        </div>
    );


}

export default SignUpBox;

