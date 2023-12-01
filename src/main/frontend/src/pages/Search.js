import React, { Component } from 'react';

class Search extends Component {
    constructor(props) {
        super(props);
        this.state = {
            searchTerm: ''
        };
    }

    handleInputChange = (event) => {
        this.setState({ searchTerm: event.target.value });
    };

    handleSubmit = (event) => {
        event.preventDefault();
        console.log('Searching for:', this.state.searchTerm);
    };

    render() {
        return (
            <div className="Search">
                <form onSubmit={this.handleSubmit}>
                    <input
                        type="text"
                        placeholder="Search..."
                        value={this.state.searchTerm}
                        onChange={this.handleInputChange}
                    />
                    <button type="submit">Search</button>
                </form>
            </div>
        );
    }
}

export default Search;