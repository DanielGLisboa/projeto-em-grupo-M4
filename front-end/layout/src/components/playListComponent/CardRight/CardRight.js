import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/css/bootstrap.css';
import "./CardRight.css"



export default class CardRight extends React.Component {
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
            <div class="cardplayOneL"> 
                <figure>
                    <img class="cardPlayA" src="https://i.postimg.cc/B6qdKGRX/image1-4-1.png" alt="Image One"/>
                    <figcaption class="legenda">Nome da Musica</figcaption>
                    <figcaption class="legenda2">Proxima</figcaption>
                </figure>
             
            </div> 
        );

    }
    
}