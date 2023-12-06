// UserInfo.js

import React from 'react';

const UserInfo = ({ user, onEdit }) => {
  return (
    <div>
      <h2>User Profile</h2>
      <p>Name: {user.name}</p>
      <p>Email: {user.email}</p>
      {/* Add other user information as needed */}

      <button onClick={onEdit}>Edit Profile</button>
    </div>
  );
};

export default UserInfo;
