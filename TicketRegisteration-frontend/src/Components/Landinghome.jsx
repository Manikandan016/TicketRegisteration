import React from 'react'
import Searchbox from '../Userlanding/Searchbox'
import "../Styles/landing.css"
import Usernav from '../Userlanding/Usernav'
const Landinghome = () => {
  return (
    <div className='landingUser'>
       <Usernav/>
          <div className=''>
             <Searchbox/>
          </div>
    </div>
  )
}

export default Landinghome
