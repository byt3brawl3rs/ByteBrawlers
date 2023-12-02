import React, {Component} from 'react';
import Header from '../General/Navigation/Header';
import './CSS/Search.css';
import ItemCard from '../MainWebPage/CSS/ItemCard.css';

class SearchTest extends Component {
    state = {
        searchQuery: '',
        items: [],
        filters: {
            pants: false,
            shoes: false,
            shirts: false,
            accessories: false,
        },
    };

    handleSearchChange = (event) => {
        this.setState({searchQuery: event.target.value});
    };
    handleFilterChange = (category) => {
        this.setState(prevState => ({
            filters: {
                ...prevState.filters,
                [category]: !prevState.filters[category],
            },
        }));
    };

    filterItems = () => {
        const {items, filters} = this.state;
        return items.filter(item => {
            return Object.keys(filters).some(category =>
                filters[category] && item.category === category
            );
        });
    };

    render() {
        const filteredItems = this.filterItems();
        return (
            <div className="SearchPage">
                <Header/>
                <div className="search-container">
                    <input
                        type="text"
                        placeholder="Search..."
                        value={this.state.searchQuery}
                        onChange={this.handleSearchChange}
                    />

                    <div className="filters">
                        {Object.keys(this.state.filters).map(category => (
                            <div key={category}>
                                <input
                                    type="checkbox"
                                    id={category}
                                    checked={this.state.filters[category]}
                                    onChange={() => this.handleFilterChange(category)}
                                />
                                <label htmlFor={category}>{category}</label>
                            </div>
                        ))}
                    </div>

                    <div className="search-results">
                        {filteredItems.map(item => (
                            <ItemCard
                                key={item.id}
                                title={item.title}
                                image={item.image}
                                description={item.description}
                                price={item.price}
                            />
                        ))}
                    </div>
                </div>
            </div>
        );
    }
}

export default SearchTest;