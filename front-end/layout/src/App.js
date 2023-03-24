
import React from 'react';
import HeaderHome from "./components/headerComponent/HeaderHome"
import Footer from './Footer'
import Home from './components/homeComponent/Home';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from './Pages/loginPage/Login';
import Catalogo from './Pages/CatalogosPage/Catalogos';
import PlayList from './Pages/playListPage/PlayList';



function App() {
  return (
    <div>
      <section>
        <Router> 
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/login" element={<Login/>}/>
          <Route path="/catalogos" element={<Catalogo/>}/>
          <Route path="/playlists" element={<PlayList/>}/>
        </Routes>
      </Router>
      </section>
      <footer>
        <Footer />
      </footer>
    </div>
  );
}

export default App;
