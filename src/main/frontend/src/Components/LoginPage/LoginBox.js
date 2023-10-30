import React from "react";

function validateData(url = "", data = {}) {

}

function LoginBox() {
    const handleSubmit = (event) => {
        const data = Array.from(event.target.elements)
            .filter((input) => input.name)
            .reduce((obj, input) => Object.assign(obj, {[input.name]: input.value}), {});
        console.log(data);
        validateData("http://localhost:8080/customer", data).then(response => console.log(response));
    }

    return (
        <div className="LoginBox">
            <form onSubmit={handleSubmit} target="/">
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

export default LoginBox;