import React from 'react'
import "../Styles/homepage.css"
import Navbar from './Navbar'
import Searchbox from '../Userlanding/Searchbox'
import Dashboard from './Dashboard'
const HomePage = () => {
  return (
    <div className='Homepage'>
      <Navbar/>
      <Searchbox/>
      <Dashboard/>
    </div>
  )
}

export default HomePage