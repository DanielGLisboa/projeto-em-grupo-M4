
import React from 'react';
import HeaderHome from "./components/headerComponent/HeaderHome"
import Footer from './Footer'
import Home from './components/homeComponent/Home';



function App() {
  return (
    <div>
      <header>
        <HeaderHome />
      </header>
      <section>
        < Home />
      </section>
      <footer>
        <Footer />
      </footer>
    </div>
  );
}

export default App;
