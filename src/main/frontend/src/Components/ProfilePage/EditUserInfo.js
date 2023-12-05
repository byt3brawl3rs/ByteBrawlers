// EditUserInfo.js

import React, { useState } from 'react';

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
    <div>
      <h2>Edit User Profile</h2>
      <label>
        Name:
        <input type="text" name="name" value={editedUser.name} onChange={handleChange} />
      </label>
      <label>
        Email:
        <input type="text" name="email" value={editedUser.email} onChange={handleChange} />
      </label>
      {/* Add other input fields for editing user information as needed */}

      <button onClick={handleSave}>Save</button>
    </div>
  );
};

export default EditUserInfo;
