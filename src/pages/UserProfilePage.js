// UserProfilePage.js

import React, {useState, useEffect} from 'react';
import UserInfo from '../Components/ProfilePage/UserInfo';
import EditUserInfo from '../Components/ProfilePage/EditUserInfo';
import Footer from "../Components/General/ExtendedInformation/Footer";
import Header from "../Components/General/Navigation/Header";

const UserProfilePage = () => {
    const [user, setUser] = useState({});
    const [editMode, setEditMode] = useState(false);

    // Fetch user data from the database on component mount
    useEffect(() => {
        // Replace this with your actual API call to fetch user data
        // Example: fetchUserData(userId).then(data => setUser(data));
        const userData = { /* user data from your database */};
        setUser(userData);
    }, []);

    const handleEditClick = () => {
        setEditMode(true);
    };

    const handleSaveClick = (updatedUser) => {
        // Replace this with your actual API call to update user data
        // Example: updateUserData(userId, updatedUser).then(() => setEditMode(false));
        // After updating the user data, setEditMode(false);
        setEditMode(false);
    };

    return (
        <div>
            <Header/>
            {editMode ? (
                <EditUserInfo user={user} onSave={handleSaveClick}/>
            ) : (
                <UserInfo user={user} onEdit={handleEditClick}/>
            )}
            <Footer/>
        </div>
    );
};

export default UserProfilePage;
