import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Signin from './Components/Signin'
import "./global.css"
import HomePage from './Components/HomePage'
import Contactus from './Components/Contactus'
import About from './Components/About'
import Adminregister from './Components/Adminregister'
import Userregister from './Components/Userregister'
import Landinghome from './Components/Landinghome'
import Adminlanding from './AdminPage/Adminlanding'
import Error from './Components/Error'
import Protect from './Components/Protect'
import Adminlogin from './Components/Adminlogin'
import Navbar from './Components/Navbar'
import Searchbox from './Userlanding/Searchbox'
import Dashboard from './Components/Dashboard'
const App=()=>{
 
    return(
        <div>
         <BrowserRouter>
        <Routes>
          <Route path='/' element={<HomePage/>}/>
            <Route path='/signin' element={<Signin/>}/> 
            <Route path='/register' element={<Userregister/>}/>
            <Route path='/contact' element={<Contactus/>}/>
            <Route path='/adminlogin' element={<Adminlogin/>} />
           
            <Route path='/adminregis' element={<Adminregister/>} />
            <Route path='/landing' element={<Protect Child={Landinghome}/>}/>
            <Route path='/adminland/*' element={<Protect Child={Adminlanding}/>}/>
            <Route path='/*' element={<Error/>}/>
            <Route path='/search' element={<Searchbox/>}/>
            <Route path='/about' element={<About/>} ></Route>
            <Route path='/dash' element={<Dashboard/>}/>
        </Routes>
        </BrowserRouter>
           
        </div>
    )
}
export default App