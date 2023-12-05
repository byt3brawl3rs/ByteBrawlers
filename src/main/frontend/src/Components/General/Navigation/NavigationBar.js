import React from "react";
import { useNavigate } from "react-router-dom";
import SearchBar from "./SearchBar";

import "./CSS/NavigationBar.css";

const NavigationBar = () => {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.setItem("isLoggedIn", "false");
    localStorage.clear();
    navigate("/");
  };

  const isLoggedIn = localStorage.getItem("isLoggedIn") === "true";

  return (
    <div className="NavigationBar">
      <SearchBar />
      <a href="/">Home</a>
      <a href="">About</a>
      {isLoggedIn ? (
        <>
          <a style={{ float: "right" }} href="/profile">
            Profile
          </a>
          <a style={{ float: "right" }} href="/cart">
            Cart
          </a>
          <a style={{ float: "right" }} onClick={handleLogout} href="/">
            Logout
          </a>
        </>
      ) : (
        <>
          <a style={{ float: "right" }} href="/signup">
            SignUp
          </a>
          <a style={{ float: "right" }} href="/login">
            Login
          </a>
          <a style={{ float: "right" }} href="/cart">
            Cart
          </a>
        </>
      )}
    </div>
  );
};

export default NavigationBar;
