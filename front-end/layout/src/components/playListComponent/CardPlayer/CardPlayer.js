import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import './CardPlayer.css';
import 'bootstrap/dist/css/bootstrap.css';



export default class CardPlay extends React.Component {
	constructor(props) {
	  super(props);
  
	  this.toggle = this.toggle.bind(this);
	  this.state = {
		isOpen: false
	  };
	}
	toggle() {
	  this.setState({
		isOpen: !this.state.isOpen
	  });
	}
    render(){
        return( 
            <div class="cardplayOne"> 
                <figure>
                    <img class="cardPlay" src="https://i.postimg.cc/B6qdKGRX/image1-4-1.png" alt="Image One"/>
                    <figcaption class="legenda">Nome da Musica</figcaption>
                    <figcaption class="legenda2">Artista</figcaption>
                    <figcaption class="legenda3">Tempo</figcaption>
                </figure>
                <div class="playerBTN"> 
                    <button class="botaoAnterior">Anterior</button>
                    <button class="botaoPlay">Play</button>
                    <button class="botaoProxima">Proxima</button> 
                                       
                </div>
            </div> 
        );

    }
    
}