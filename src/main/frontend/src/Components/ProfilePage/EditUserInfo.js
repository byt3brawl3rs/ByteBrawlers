// EditUserInfo.js

import React, { useState } from 'react';
import './CSS/EditUserInfo.css'; // Import the CSS file for styling

const EditUserInfo = ({ user, onSave }) => {
  const [editedUser, setEditedUser] = useState({ ...user });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setEditedUser((prevUser) => ({ ...prevUser, [name]: value }));
  };

  const handleSave = () => {
    onSave(editedUser);
  };

  return (
    <div className="edit-user-container">
      <h2>Edit User Profile</h2>
      <form className="edit-form">
        <label className="edit-label">
          Name:
          <input type="text" name="name" value={editedUser.name} onChange={handleChange} />
        </label>
        <label className="edit-label">
          Email:
          <input type="text" name="email" value={editedUser.email} onChange={handleChange} />
        </label>
        <label className="edit-label">
          Username:
          <input type="text" name="username" value={editedUser.username} onChange={handleChange} />
        </label>
        <label className="edit-label">
          Phone:
          <input type="text" name="phone" value={editedUser.phone} onChange={handleChange} />
        </label>
        <label className="edit-label">
          Address:
          <input type="text" name="address" value={editedUser.address} onChange={handleChange} />
        </label>
        {/* Add other input fields for editing user information as needed */}
        <button className="save-button" onClick={handleSave}>
          Save
        </button>
      </form>
    </div>
  );
};

export default EditUserInfo;
