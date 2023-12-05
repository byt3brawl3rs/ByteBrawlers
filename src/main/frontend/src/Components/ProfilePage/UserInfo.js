// UserInfo.js

import React from 'react';
import './CSS/UserInfo.css'; // Import a separate CSS file for styling

const UserInfo = ({ user, onEdit }) => {
  return (
    <div className="user-info-container">
      <h2>User Profile</h2>
      <div className="user-info">
        <p className="info-item">
          <span className="info-label">Name:</span> {user.name}
        </p>
        <p className="info-item">
          <span className="info-label">Email:</span> {user.email}
        </p>
        <p className="info-item">
          <span className="info-label">Username:</span> {user.username}
        </p>
        <p className="info-item">
          <span className="info-label">Phone:</span> {user.phone}
        </p>
        <p className="info-item">
          <span className="info-label">Address:</span> {user.address}
        </p>
        {/* Add other user information as needed */}
      </div>
      <button className="edit-button" onClick={onEdit}>
        Edit Profile
      </button>
    </div>
  );
};

export default UserInfo;
