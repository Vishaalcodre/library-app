import React from 'react';
import './App.css';
import { Navbar } from './layouts/NavbarAndFooter/navbar';
import { ExploreTopBooks } from './layouts/HomePage/ExploreTopBooks';

function App() {
  return (
    <div>
      <Navbar/>
      <ExploreTopBooks/>
    </div>
    
  );
}

export default App;
